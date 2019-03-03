import axios from 'axios'

const baseUrl = 'http://api.openweathermap.org/data/2.5/weather?'
const apiKey = '&APPID=606cfe8ecc6c30e6541a9d68f6816568' // insecure storage of api key
const osloId = 'id=6453366'
const londonId = 'id=2643743'
const minskId = 'id=625144'
const useMetricUnits = '&units=metric'

const getWeatherData = (city) => {
	var id = ''
	if (city === 'Oslo') id = osloId
	else if (city === 'London') id = londonId
	else if (city === 'Minsk') id = minskId
	else console.log('api/index.js: Error: city ' + city + ' not recognized!')
	
	return axios.get(baseUrl + id + apiKey + useMetricUnits)
		.then(result => {
			// console.log(result.data) // for debugging
			return result.data
		})
		.catch(error => {
			console.log(error)
			error
		})
}

export default {
  getWeatherData
}
