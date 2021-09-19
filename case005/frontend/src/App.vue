<template>
  <div id="app">
    <h1 id="brand">Vaskeriet</h1>
    <md-tabs md-sync-route class="md-primary" md-alignment="centered">
      <md-tab id="tab-home" md-label="Hjem">
        <Home />
      </md-tab>
      <md-tab id="tab-counter" md-label="Reserver">
        <Reserve />
      </md-tab>
      <md-tab id="tab-posts" md-label="Avlys">
        <Cancel />
      </md-tab>
      <md-tab id="tab-favorites" md-label="Venteliste">
        <WaitingList />
      </md-tab>
    </md-tabs>
    <Footer />
  </div>
</template>

<script>
import Home from './components/Home'
import Reserve from './components/Reserve'
import Cancel from './components/Cancel'
import WaitingList from './components/WaitingList'
import Footer from './components/Footer'
export default {
  name: 'App',
  data () {
    return {
    }
  },
  components: {
    Home,
    Reserve,
    Cancel,
    WaitingList,
    Footer
  },
  mounted () {
    this.$store.dispatch('getReservations')
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #253544;
}

#brand {
  background-color: #448AFF;
  margin-top: 0rem;
  margin-bottom: 0rem;
  padding-top:2rem;
  padding-bottom:1rem;
}
</style>
