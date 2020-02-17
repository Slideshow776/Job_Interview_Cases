export const requestedReservationStatus = (state, status) => {
  state.requestedReservationStatus = status
}

export const requestedWaitingStatus = (state, status) => {
  state.requestedWaitingStatus = status
}

export const deletedReservationStatus = (state, status) => {
  state.deniedReservation = status
}

export const setReservations = (state, reservations) => {
  state.reservations = reservations
}

export const setWaitingReservations = (state, reservations) => {
  state.waitingList = reservations
}
