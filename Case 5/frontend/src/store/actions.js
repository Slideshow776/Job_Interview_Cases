import api from '../api'

export const getReservations = ({commit}) => {
  api.performRpcWithPromise('getReservations', {})
    .then((data) => {
      commit('setReservations', data)
    })
    .catch(error => {
      console.log(error)
      return error
    })
}

export const getWaitingList = ({commit}) => {
  api.performRpcWithPromise('getWaitingList', {})
    .then((data) => {
      commit('setWaitingReservations', data)
    })
    .catch(error => {
      console.log(error)
      return error
    })
}

export const makeReservation = ({commit, dispatch}, reservation) => {
  api.performRpcWithPromise('makeReservation', {'reservation': reservation})
    .then((data) => {
      commit('requestedReservationStatus', data)
      dispatch('getReservations')
    })
    .catch(error => {
      console.log(error)
      return error
    })
}

export const waitingList = ({commit, dispatch}, reservation) => {
  api.performRpcWithPromise('addToWaitingList', {'reservation': reservation})
    .then((data) => {
      commit('requestedWaitingStatus', data)
      dispatch('getWaitingList')
    })
    .catch(error => {
      console.log(error)
      return error
    })
}

export const deleteReservation = ({commit, dispatch}, reservation) => {
  api.performRpcWithPromise('deleteReservation', {'reservation': reservation})
    .then((data) => {
      commit('deletedReservationStatus', data)
      dispatch('getReservations')
      dispatch('getWaitingList')
    })
    .catch(error => {
      console.log(error)
      return error
    })
}

export const deleteWaitingReservation = ({commit, dispatch}, reservation) => {
  api.performRpcWithPromise('deleteWaitingReservation', {'reservation': reservation})
    .then((data) => {
      commit('requestedWaitingStatus', data)
      dispatch('getWaitingList')
    })
    .catch(error => {
      console.log(error)
      return error
    })
}

export const setRequestedReservationStatus = ({commit}, state) => {
  commit('requestedReservationStatus', state)
}
