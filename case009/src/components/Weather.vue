<template>
  <div class="component">
		<div id="information">
			<img alt="Weather logo" src="../assets/logo.png">		
			<h1>Welcome to the Weather Widget</h1>
			<p id="ingress">This widget was created as part of a job interview case. It lists weather data for three cities and when the data was last updated.</p>
		</div>

		<table>
			<tr
				v-for="item in weatherData"
				v-bind:key = "item.title"
			>
				<td align="left"><h2>{{item.title}}</h2></td>
				<td v-if="item.weatherData"><p class="update-text">{{item.weatherData.weather[0].description}}</p></td>
				<td v-if="item.weatherData"><img class="weather-icon" v-bind:src="'http://openweathermap.org/img/w/' + item.weatherData.weather[0].icon +'.png'" alt="weather icon"></td>
				<td v-if="item.weatherData"><p class="degree-text">{{item.weatherData.main.temp}}&#8451;</p></td>
				<td v-if="item.weatherData"><p class="update-text">last updated at {{item.updatedAt}}</p></td>
				<td v-else class="error-text">No weather data available</td>
			</tr>
		</table>
  </div>
</template>

<script>
import api from '../api/index'
import moment from 'moment'
export default {
  name: 'Weather',
  data () {
    return {
			weatherData: [
				{title: 'Oslo', weatherData: null, updatedAt: null},
				{title: 'London', weatherData: null, updatedAt: null},
				{title: 'Minsk', weatherData: null, updatedAt: null},
			]
			/* weatherData: [ // dummy data, as to not accidentally overload the api, or in case API key is missing
				{title: 'Oslo', weatherData: { weather: [ {icon:'10d', description:'tolerable weather'} ], main: {temp: 10} }, updatedAt:  moment().format('H:mm:ss') },
				{title: 'London', weatherData: null, updatedAt:  moment().format('H:mm:ss') },
				{title: 'Minsk', weatherData: { weather: [ {icon:'04d', description:'could be better'} ], main: {temp: 13} }, updatedAt:  moment().format('H:mm:ss') }
			] */
    }
  },
  mounted () {
		this.getWeatherDataOf('Oslo')
		this.getWeatherDataOf('London')
		this.getWeatherDataOf('Minsk')

		this.continuouslyCallApi('Oslo')
		this.continuouslyCallApi('London')
		this.continuouslyCallApi('Minsk')
  },
  methods: {
		getWeatherDataOf (city) {
			// console.log('components/Weather.vue: updating weather data for: ' + city + ' ' + moment().format('H:mm:ss')) // for debugging
			api.getWeatherData(city)
				.then(result => {
					this.weatherData.forEach(function(listEntry) {
						if (listEntry.title === city) { // Attach weather data to the respective city
							listEntry.weatherData = result
							listEntry.updatedAt = moment().format('H:mm:ss')
						}
					})
					return result
				})
				.catch(error => {
					console.log('components/Weather.vue: ' + error)
					return error
				})
		},
		continuouslyCallApi (city) {
			this.$nextTick(function () {
				window.setInterval(() => {
					this.getWeatherDataOf(city);
				},60000); // 60.000ms = 1min
			})
		}
  }
}
</script>

<style scoped lang="scss">
  .component {
    background-color: #a9a9a9;
		padding-top: 3rem;
		padding-bottom: 6rem; /* +3 for footer offset */
  }

	table {
		background-color: #efefef;
		margin: auto;
		border-radius: .5rem;
		padding-right: 3rem;
		padding-left: 3rem;
	}

	#ingress {
		font-style: italic;
	}

	.update-text {
		font-style: italic;
		margin-left: 1rem;
	}

	.degree-text {
		color: #ff3b3f;
		font-weight: bold;
		font-size: 2rem;
		padding-left: 1rem;
	}

  .weather-icon {
    width: 7rem;
  }

	.error-text {
		color: #ff3b3f;
		font-style: italic;
		padding-left: 2rem;
	}

  img {
    width: 12rem;
  }
</style>
