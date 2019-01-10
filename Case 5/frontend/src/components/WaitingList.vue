<template>
    <div id="component">
      <h3 v-if="this.getWaitingList.length === 0">Det finnes ingen på ventelisten</h3>
      <div
        v-for="item in this.getWaitingList"
        :key="item.label+item.date+item.program"
        @click="removeReservation(item)"
      >
        <md-button class="md-raised reservations"
        >
          {{item.label}}
          <!-- <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"><path opacity=".87" fill="none" d="M0 0h24v24H0V0z"/><path d="M12 2C6.47 2 2 6.47 2 12s4.47 10 10 10 10-4.47 10-10S17.53 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm3.59-13L12 10.59 8.41 7 7 8.41 10.59 12 7 15.59 8.41 17 12 13.41 15.59 17 17 15.59 13.41 12 17 8.41z"/></svg> -->
        </md-button>
        <md-tooltip md-direction="right" md-delay="300">Trykk for å avlyse</md-tooltip>
      </div>
      <md-dialog-alert
      :md-active.sync="deleteReservation"
      md-content="Reservasjonen din er nå tatt av ventelisten!"
      md-confirm-text="Takk" />
    </div>
</template>

<script>
import { mapGetters } from 'vuex'
export default {
  name: 'WaitingList',
  data: () => ({
    deleteReservation: false
  }),
  computed: {
    ...mapGetters([
      'getWaitingList',
      'requestedWaitingStatus'
    ])
  },
  methods: {
    removeReservation (reservation) {
      this.deleteReservation = true
      this.$store.dispatch('deleteWaitingReservation', reservation)
    }
  }
}
</script>

<style scoped>
    #component {
      align-items: center;
      display: flex;
      justify-content: center;
      flex-direction: column;
    }

    #reservation-deleted {
      color:red;
      padding-top: 2rem;
      font-size: .95rem;
      font-weight: bold;
    }

    svg {
      margin-left: 3rem;
      opacity: .75;
    }

    .reservations {
      background-color: rgb(168, 195, 255);
      min-width:25rem;
      max-width:25rem;
      height:4rem;
      margin-top:.1225rem;
      margin-bottom:.1225rem;
    }
</style>
