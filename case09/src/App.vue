<template>
  <div id="app">
    <Header/>
    <Weather/>
    <Footer/>
  </div>
</template>

<script>
import Header from './components/Header.vue'
import Weather from './components/Weather.vue'
import Footer from './components/Footer.vue'

export default {
  name: 'app',
  components: {
    Header,
    Weather,
    Footer
  }
}
</script>

<style lang="scss">

	body {
		background-color: #a9a9a9;
		margin: 0;
	}

	#app {
		font-family: 'Avenir', Helvetica, Arial, sans-serif;
		-webkit-font-smoothing: antialiased;
		-moz-osx-font-smoothing: grayscale;
		text-align: center;
		color: #253544;

		background-color: #a9a9a9;
	}
</style>
