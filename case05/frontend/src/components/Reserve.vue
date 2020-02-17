<template>
    <div id="component">
        <div id="form">
            <h3>Fyll ut feltene for å gjøre din reservasjon</h3>
            <md-datepicker v-model="selectedDate" md-immediately>
                <label>Velg dato</label>
            </md-datepicker>
            <div class="md-layout-item">
                <md-field>
                    <md-select v-model="selectedProgram" placeholder="Velg program">
                    <md-option value="boilWash">Kokvask:&nbsp;90&deg;C,&nbsp;90&nbsp;minutter</md-option>
                    <md-option value="clothWash">Tøyvask:&nbsp;40&deg;C,&nbsp;60&nbsp;minutter</md-option>
                    <md-option value="handWash">Håndvask:&nbsp;30&deg;C,&nbsp;20&nbsp;minutter</md-option>
                    </md-select>
                </md-field>
            </div>
            <md-field>
            <label>Velg tidspunkt</label>
                <md-input v-model="selectedTime"></md-input>
                <span class="md-helper-text">tt:mm</span>
            </md-field>
            <md-button
                class="md-raised md-primary button"
                style=""
                @click="makeReservation"
            >Reserver</md-button>
        </div>
        <div
            v-if="this.requestedReservationStatus"
            id="reservation-denied"
        >Reservasjonen gikk ikke gjennom, vennligst prøv igjen eller sett deg på ventelisten!
          <md-field>
            <label>Vennligst angi telefonnummer eller e-post for varsling</label>
            <md-input v-model="selectedPhoneNumber"></md-input>
          </md-field>
          <md-button class="md-raised" @click="waitingList">Sett meg på venteliste</md-button>
        </div>
        <div style="color:green;padding-top:1rem;" v-else-if="!this.requestedReservationStatus && this.request">
            Reservasjonen din er godkjent! Husk å møte i god tid.
        </div>
        </div>
</template>

<script>
import { mapGetters } from 'vuex'
import mixin from '../mixin'
export default {
  name: 'Reserve',
  data: () => ({
    selectedDate: null,
    selectedProgram: null,
    selectedTime: null,
    selectedPhoneNumber: null,
    request: false
  }),
  computed: {
    ...mapGetters([
      'requestedReservationStatus'
    ])
  },
  methods: {
    makeReservation () {
      this.request = true
      const day = mixin.getDay(this.selectedDate)
      const month = mixin.getMonth(this.selectedDate)
      const label = day + ' ' + this.selectedDate.getDate() + ' ' + month + ' kl:' + this.selectedTime
      const reservation = {
        date: this.selectedDate,
        program: this.selectedProgram,
        time: this.selectedTime,
        label: label
      }
      this.$store.dispatch('makeReservation', reservation)
    },
    waitingList () {
      this.request = false
      this.$store.dispatch('setRequestedReservationStatus', false)
      const day = mixin.getDay(this.selectedDate)
      const month = mixin.getMonth(this.selectedDate)
      const label = day + ' ' + this.selectedDate.getDate() + ' ' + month + ' kl:' + this.selectedTime
      const reservation = {
        date: this.selectedDate,
        program: this.selectedProgram,
        time: this.selectedTime,
        label: label
      }
      this.$store.dispatch('waitingList', reservation)
    }
  }
}
</script>

<style scoped>

    #reservation-denied {
        color:red;
        padding-top: 2rem;
        font-size: .95rem;
        font-weight: bold;
        align-items: center;
        display: flex;
        flex-direction: column;
    }

    .button {
        float:left;
        margin-top: 2rem;
        margin-left: 0rem;
        /* border: .04rem solid black; */
    }

    #component {
        align-items: center;
        display: flex;
        justify-content: center;
        flex-direction: column;
        margin-bottom:5rem;
    }

    #form {
        width:25rem;
    }
</style>
