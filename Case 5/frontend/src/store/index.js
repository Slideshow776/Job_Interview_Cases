import Vue from 'vue'
import Vuex from 'vuex'
import * as mutations from './mutations'
import * as actions from './actions'
import * as getters from './getters'

Vue.use(Vuex)

const state = {
  requestedReservationStatus: false,
  requestedWaitingStatus: false,
  deletedReservationStatus: false,
  reservations: [],
  waitingList: []
}

export default new Vuex.Store({
  state,
  actions,
  mutations,
  getters
})
