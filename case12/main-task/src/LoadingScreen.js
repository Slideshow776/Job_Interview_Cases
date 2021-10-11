import logo from './logo.svg';
import openWeatherMapLogo from './images/openweathermap.png';
import './App.css';
import { useHistory as UseHistory } from "react-router-dom";

function componentDidMount() {
  const baseUrl = 'http://api.openweathermap.org/data/2.5/forecast?';
  const oslo = 'q=oslo';
  const apiKey = '&APPID=606cfe8ecc6c30e6541a9d68f6816568'; // insecure storage of api key
  const useMetricUnits = '&units=metric';
  // example:
  // http://api.openweathermap.org/data/2.5/forecast?q=oslo&APPID=606cfe8ecc6c30e6541a9d68f6816568&units=metric

    let history = UseHistory();  
    setTimeout(function(){
      /* --------------------- */
      fetch(baseUrl + oslo + apiKey + useMetricUnits)
      .then(response => response.json())
      .then(data => {        
        history.push({
          pathname: "/weather",
          state: { data: data.list }
        });
      });
      /* --------------------- */
    }, 2000); /* 2 seconds delay just so we actually can see the loading screen.. */
}

function LoadingScreen() {
  componentDidMount();

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>
          Loading weather data...
        </h1>
        <a
          className="App-link"
          href="https://openweathermap.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Powered by OpenWeatherMap
        <img src={openWeatherMapLogo} className="openWeatherMap-logo" alt="OpenWeather app logo" />
        </a>
      </header>
    </div>
  );
}

export default LoadingScreen;
