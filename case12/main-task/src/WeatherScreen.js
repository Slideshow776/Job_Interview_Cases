import './App.css';
import { render as Render } from 'react-dom';
import { useHistory as UseHistory } from "react-router-dom";
import React, { useState } from "react";

function WeatherScreen() {
    const history = UseHistory();
    
    let openweathermapData = history.location.state.data;
    let dummyData = [
        {"dt":1633780800,"main":{"temp":13.95,"feels_like":13.1,"temp_min":13.95,"temp_max":14.24,"pressure":1015,"sea_level":1015,"grnd_level":1026,"humidity":65,"temp_kf":-0.29},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":3.42,"deg":192,"gust":7.24},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-09 12:00:00"},
        {"dt":1633791600,"main":{"temp":14.14,"feels_like":13.57,"temp_min":14.14,"temp_max":14.31,"pressure":1021,"sea_level":1021,"grnd_level":1024,"humidity":75,"temp_kf":-0.17},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":87},"wind":{"speed":4.16,"deg":192,"gust":8.45},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-09 15:00:00"},
        {"dt":1633802400,"main":{"temp":11.83,"feels_like":11.58,"temp_min":11.83,"temp_max":11.83,"pressure":1027,"sea_level":1027,"grnd_level":1024,"humidity":96,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":77},"wind":{"speed":3.1,"deg":182,"gust":8.31},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-09 18:00:00"},
        {"dt":1633813200,"main":{"temp":11.41,"feels_like":11.03,"temp_min":11.41,"temp_max":11.41,"pressure":1026,"sea_level":1026,"grnd_level":1023,"humidity":93,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":85},"wind":{"speed":3.16,"deg":190,"gust":7.42},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-09 21:00:00"},
        {"dt":1633824000,"main":{"temp":11.11,"feels_like":10.73,"temp_min":11.11,"temp_max":11.11,"pressure":1024,"sea_level":1024,"grnd_level":1021,"humidity":94,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":92},"wind":{"speed":2.76,"deg":187,"gust":7.5},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-10 00:00:00"},
        {"dt":1633834800,"main":{"temp":10.33,"feels_like":9.87,"temp_min":10.33,"temp_max":10.33,"pressure":1022,"sea_level":1022,"grnd_level":1019,"humidity":94,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":100},"wind":{"speed":2.07,"deg":193,"gust":5.75},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-10 03:00:00"},{"dt":1633845600,"main":{"temp":9.79,"feels_like":8.99,"temp_min":9.79,"temp_max":9.79,"pressure":1020,"sea_level":1020,"grnd_level":1017,"humidity":93,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":1.95,"deg":195,"gust":5.45},"visibility":9142,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-10 06:00:00"},{"dt":1633856400,"main":{"temp":11.44,"feels_like":10.86,"temp_min":11.44,"temp_max":11.44,"pressure":1018,"sea_level":1018,"grnd_level":1015,"humidity":85,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":2.71,"deg":213,"gust":5.96},"visibility":10000,"pop":0.03,"sys":{"pod":"d"},"dt_txt":"2021-10-10 09:00:00"},{"dt":1633867200,"main":{"temp":12.38,"feels_like":11.89,"temp_min":12.38,"temp_max":12.38,"pressure":1016,"sea_level":1016,"grnd_level":1013,"humidity":85,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":3.7,"deg":203,"gust":11.29},"visibility":10000,"pop":0.4,"rain":{"3h":0.5},"sys":{"pod":"d"},"dt_txt":"2021-10-10 12:00:00"},{"dt":1633878000,"main":{"temp":12.02,"feels_like":11.6,"temp_min":12.02,"temp_max":12.02,"pressure":1013,"sea_level":1013,"grnd_level":1010,"humidity":89,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":100},"wind":{"speed":4.76,"deg":213,"gust":10.37},"visibility":10000,"pop":0.53,"rain":{"3h":0.42},"sys":{"pod":"d"},"dt_txt":"2021-10-10 15:00:00"},{"dt":1633888800,"main":{"temp":10.23,"feels_like":9.84,"temp_min":10.23,"temp_max":10.23,"pressure":1011,"sea_level":1011,"grnd_level":1008,"humidity":97,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":92},"wind":{"speed":2.67,"deg":196,"gust":6.83},"visibility":10000,"pop":0.35,"sys":{"pod":"n"},"dt_txt":"2021-10-10 18:00:00"},{"dt":1633899600,"main":{"temp":8.16,"feels_like":7.25,"temp_min":8.16,"temp_max":8.16,"pressure":1010,"sea_level":1010,"grnd_level":1006,"humidity":98,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":29},"wind":{"speed":1.79,"deg":218,"gust":3.35},"visibility":10000,"pop":0.01,"sys":{"pod":"n"},"dt_txt":"2021-10-10 21:00:00"},{"dt":1633910400,"main":{"temp":7.95,"feels_like":7.4,"temp_min":7.95,"temp_max":7.95,"pressure":1009,"sea_level":1009,"grnd_level":1005,"humidity":81,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":41},"wind":{"speed":1.42,"deg":235,"gust":4.23},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-11 00:00:00"},{"dt":1633921200,"main":{"temp":5.77,"feels_like":5.77,"temp_min":5.77,"temp_max":5.77,"pressure":1008,"sea_level":1008,"grnd_level":1005,"humidity":89,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":46},"wind":{"speed":0.6,"deg":273,"gust":0.98},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-11 03:00:00"},{"dt":1633932000,"main":{"temp":6,"feels_like":6,"temp_min":6,"temp_max":6,"pressure":1007,"sea_level":1007,"grnd_level":1004,"humidity":88,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":72},"wind":{"speed":1.25,"deg":1,"gust":1.31},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-11 06:00:00"},{"dt":1633942800,"main":{"temp":9.23,"feels_like":9.23,"temp_min":9.23,"temp_max":9.23,"pressure":1007,"sea_level":1007,"grnd_level":1004,"humidity":73,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":48},"wind":{"speed":0.93,"deg":304,"gust":1.75},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-11 09:00:00"},{"dt":1633953600,"main":{"temp":11.68,"feels_like":10.5,"temp_min":11.68,"temp_max":11.68,"pressure":1007,"sea_level":1007,"grnd_level":1004,"humidity":61,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":68},"wind":{"speed":1.61,"deg":326,"gust":3.26},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-11 12:00:00"},{"dt":1633964400,"main":{"temp":10.29,"feels_like":9.25,"temp_min":10.29,"temp_max":10.29,"pressure":1007,"sea_level":1007,"grnd_level":1004,"humidity":72,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":44},"wind":{"speed":2.05,"deg":341,"gust":4.31},"visibility":10000,"pop":0.68,"rain":{"3h":0.61},"sys":{"pod":"d"},"dt_txt":"2021-10-11 15:00:00"},{"dt":1633975200,"main":{"temp":8.57,"feels_like":7.01,"temp_min":8.57,"temp_max":8.57,"pressure":1009,"sea_level":1009,"grnd_level":1006,"humidity":76,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":72},"wind":{"speed":2.67,"deg":347,"gust":6.71},"visibility":10000,"pop":1,"rain":{"3h":0.86},"sys":{"pod":"n"},"dt_txt":"2021-10-11 18:00:00"},{"dt":1633986000,"main":{"temp":6.69,"feels_like":6.04,"temp_min":6.69,"temp_max":6.69,"pressure":1010,"sea_level":1010,"grnd_level":1007,"humidity":87,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":100},"wind":{"speed":1.37,"deg":268,"gust":1.44},"visibility":10000,"pop":0.33,"rain":{"3h":0.44},"sys":{"pod":"n"},"dt_txt":"2021-10-11 21:00:00"},{"dt":1633996800,"main":{"temp":4.46,"feels_like":3.43,"temp_min":4.46,"temp_max":4.46,"pressure":1009,"sea_level":1009,"grnd_level":1006,"humidity":86,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":77},"wind":{"speed":1.43,"deg":273,"gust":1.29},"visibility":10000,"pop":0.16,"sys":{"pod":"n"},"dt_txt":"2021-10-12 00:00:00"},{"dt":1634007600,"main":{"temp":3.61,"feels_like":2.46,"temp_min":3.61,"temp_max":3.61,"pressure":1009,"sea_level":1009,"grnd_level":1006,"humidity":82,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":83},"wind":{"speed":1.43,"deg":340,"gust":1.69},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-12 03:00:00"},{"dt":1634018400,"main":{"temp":2.51,"feels_like":0.71,"temp_min":2.51,"temp_max":2.51,"pressure":1010,"sea_level":1010,"grnd_level":1007,"humidity":84,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":66},"wind":{"speed":1.8,"deg":317,"gust":2.08},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-12 06:00:00"},{"dt":1634029200,"main":{"temp":6.69,"feels_like":5.68,"temp_min":6.69,"temp_max":6.69,"pressure":1011,"sea_level":1011,"grnd_level":1008,"humidity":74,"temp_kf":0},"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"clouds":{"all":41},"wind":{"speed":1.67,"deg":316,"gust":4.4},"visibility":10000,"pop":0.2,"rain":{"3h":0.18},"sys":{"pod":"d"},"dt_txt":"2021-10-12 09:00:00"},{"dt":1634040000,"main":{"temp":10,"feels_like":9.01,"temp_min":10,"temp_max":10,"pressure":1010,"sea_level":1010,"grnd_level":1007,"humidity":58,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":42},"wind":{"speed":2.24,"deg":308,"gust":5.04},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-12 12:00:00"},{"dt":1634050800,"main":{"temp":9.21,"feels_like":9.21,"temp_min":9.21,"temp_max":9.21,"pressure":1010,"sea_level":1010,"grnd_level":1007,"humidity":68,"temp_kf":0},"weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],"clouds":{"all":14},"wind":{"speed":0.8,"deg":344,"gust":0.85},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-12 15:00:00"},{"dt":1634061600,"main":{"temp":7.05,"feels_like":7.05,"temp_min":7.05,"temp_max":7.05,"pressure":1012,"sea_level":1012,"grnd_level":1009,"humidity":74,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":54},"wind":{"speed":1.24,"deg":322,"gust":1.14},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-12 18:00:00"},{"dt":1634072400,"main":{"temp":5.13,"feels_like":3.98,"temp_min":5.13,"temp_max":5.13,"pressure":1014,"sea_level":1014,"grnd_level":1010,"humidity":80,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],"clouds":{"all":55},"wind":{"speed":1.59,"deg":2,"gust":1.54},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-12 21:00:00"},{"dt":1634083200,"main":{"temp":4.03,"feels_like":3.07,"temp_min":4.03,"temp_max":4.03,"pressure":1015,"sea_level":1015,"grnd_level":1012,"humidity":82,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03n"}],"clouds":{"all":50},"wind":{"speed":1.34,"deg":359,"gust":1.27},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-13 00:00:00"},{"dt":1634094000,"main":{"temp":3.83,"feels_like":2.74,"temp_min":3.83,"temp_max":3.83,"pressure":1016,"sea_level":1016,"grnd_level":1013,"humidity":82,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":95},"wind":{"speed":1.41,"deg":337,"gust":1.39},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-13 03:00:00"},{"dt":1634104800,"main":{"temp":4.38,"feels_like":3.32,"temp_min":4.38,"temp_max":4.38,"pressure":1018,"sea_level":1018,"grnd_level":1015,"humidity":78,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":97},"wind":{"speed":1.44,"deg":312,"gust":1.53},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-13 06:00:00"},{"dt":1634115600,"main":{"temp":7.86,"feels_like":7.86,"temp_min":7.86,"temp_max":7.86,"pressure":1019,"sea_level":1019,"grnd_level":1016,"humidity":63,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":62},"wind":{"speed":0.94,"deg":326,"gust":1.51},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-13 09:00:00"},{"dt":1634126400,"main":{"temp":10.43,"feels_like":8.83,"temp_min":10.43,"temp_max":10.43,"pressure":1020,"sea_level":1020,"grnd_level":1016,"humidity":50,"temp_kf":0},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"clouds":{"all":35},"wind":{"speed":1.19,"deg":287,"gust":1.95},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-13 12:00:00"},{"dt":1634137200,"main":{"temp":9.13,"feels_like":9.13,"temp_min":9.13,"temp_max":9.13,"pressure":1020,"sea_level":1020,"grnd_level":1017,"humidity":61,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":83},"wind":{"speed":0.68,"deg":257,"gust":0.91},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-13 15:00:00"},{"dt":1634148000,"main":{"temp":5.61,"feels_like":5.61,"temp_min":5.61,"temp_max":5.61,"pressure":1021,"sea_level":1021,"grnd_level":1018,"humidity":75,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":85},"wind":{"speed":0.85,"deg":178,"gust":0.89},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-13 18:00:00"},{"dt":1634158800,"main":{"temp":5.21,"feels_like":5.21,"temp_min":5.21,"temp_max":5.21,"pressure":1021,"sea_level":1021,"grnd_level":1018,"humidity":85,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"clouds":{"all":100},"wind":{"speed":1.26,"deg":158,"gust":1.65},"visibility":10000,"pop":0,"sys":{"pod":"n"},"dt_txt":"2021-10-13 21:00:00"},{"dt":1634169600,"main":{"temp":5.02,"feels_like":5.02,"temp_min":5.02,"temp_max":5.02,"pressure":1019,"sea_level":1019,"grnd_level":1016,"humidity":92,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":1.27,"deg":171,"gust":2.23},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-14 00:00:00"},{"dt":1634180400,"main":{"temp":4.8,"feels_like":4.8,"temp_min":4.8,"temp_max":4.8,"pressure":1018,"sea_level":1018,"grnd_level":1014,"humidity":95,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":100},"wind":{"speed":0.72,"deg":226,"gust":0.95},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-14 03:00:00"},
        {"dt":1634191200,"main":{"temp":3.78,"feels_like":3.78,"temp_min":3.78,"temp_max":3.78,"pressure":1017,"sea_level":1017,"grnd_level":1013,"humidity":93,"temp_kf":0},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"clouds":{"all":95},"wind":{"speed":0.8,"deg":248,"gust":0.78},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-14 06:00:00"},
        {"dt":1634202000,"main":{"temp":7.48,"feels_like":7.48,"temp_min":7.48,"temp_max":7.48,"pressure":1015,"sea_level":1015,"grnd_level":1011,"humidity":73,"temp_kf":0},"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],"clouds":{"all":77},"wind":{"speed":1.28,"deg":213,"gust":2.26},"visibility":10000,"pop":0,"sys":{"pod":"d"},"dt_txt":"2021-10-14 09:00:00"}];
    // console.log("dummyData: ", dummyData);
    let weatherData = openweathermapData // change this to either use real or dummy data.

    function weatherCardData(weatherData) {
        var cards = [];
        var uniqueCards = [];
        for(let i = 0; i < weatherData.length; i++) {        
            let dt_txt = weatherData[i].dt_txt.split(" ");
            
            if ( !uniqueCards.includes(dt_txt[0]) ) {
                cards.push({
                    date: dt_txt[0],
                    weather_description: weatherData[i].weather[0].description,
                    weather_icon: weatherData[i].weather[0].icon,
                    avg_temp: weatherData[i].main.temp
                });
                uniqueCards.push(dt_txt[0]);
            }
        }
        return cards;
    }

    function hourlyForecast(weatherData) {
        var days = [];
        var uniqueDays = [];
        for(let i = 0; i < weatherData.length; i++) {        
            let dt_txt = weatherData[i].dt_txt.split(" ");
            
            if ( !uniqueDays.includes(dt_txt[0]) ) {
                days.push({
                    date: dt_txt[0],
                    data: [{
                        time: dt_txt[1],
                        weather: weatherData[i].weather[0].description,
                        min_temp: weatherData[i].main.temp_min,
                        max_temp: weatherData[i].main.temp_max,
                    }]
                });
                uniqueDays.push(dt_txt[0]);
            }

            for(let j = 0; j < days.length; j++) {
                if ( days[j].date === dt_txt[0] && days[j].data[0].time !== dt_txt[1]) {
                    days[j].data.push({
                        time: dt_txt[1],
                        weather: weatherData[i].weather[0].description,
                        min_temp: weatherData[i].main.temp_min,
                        max_temp: weatherData[i].main.temp_max,
                    });
                }
            }        
        }
        return days;
    }

    let showOnlyThreeCards = weatherCardData(weatherData).slice(0, 3);
    const [showCard, setShowCard] = useState(showOnlyThreeCards);

    let hourlyData = hourlyForecast(weatherData);
    const [indexHourly, setIndexTemperature] = useState(0);
    const [showHourlyData, setShowTemperatureData] = useState(hourlyData[indexHourly]);

    // Left arrow to get the temperature for prev day
    function goLeft() {
        // weather cards

        // hourly data
        if (indexHourly > 0) {
            setIndexTemperature(indexHourly - 1, this);
            setShowTemperatureData(hourlyData[indexHourly - 1]);

            // weather cards
            let data = weatherCardData(weatherData);
            let cardsToBeShown = [];

            if (indexHourly+1 < hourlyData.length - 1) {
                cardsToBeShown = [data[indexHourly - 1], data[indexHourly], data[indexHourly + 1]];
            } else {
                cardsToBeShown = [data[indexHourly - 2], data[indexHourly - 1], data[indexHourly]];
            }
            console.log("indexHourly: ", indexHourly, "cardsToBeShown: ", [indexHourly - 1, indexHourly, indexHourly + 1]);
            /* 
            if (indexHourly + 1 < hourlyData.length - 1) {
                cardsToBeShown = [data[indexHourly], data[indexHourly+1], data[indexHourly+2]];
            } else {
                cardsToBeShown = [data[hourlyData.length - 3], data[hourlyData.length - 2], data[hourlyData.length - 1]];
            }
             */
            setShowCard(cardsToBeShown);
        }
    }

    // Right arrow to get the temperature for next day
    function goRight() {
        // hourly data
        if (indexHourly < hourlyData.length - 1) {
            setIndexTemperature(indexHourly + 1, this); 
            setShowTemperatureData(hourlyData[indexHourly + 1]);

            // weather cards
            let data = weatherCardData(weatherData);
            let cardsToBeShown = [];

            if (indexHourly + 1 < hourlyData.length - 1) {
                cardsToBeShown = [data[indexHourly], data[indexHourly+1], data[indexHourly+2]];
            } else {
                cardsToBeShown = [data[hourlyData.length - 3], data[hourlyData.length - 2], data[hourlyData.length - 1]];
            }
            setShowCard(cardsToBeShown);
        }
        
        
    }

    return (
        <div className="App App-header" >
            <h1>Oslo's Weather</h1>
            {/* Weather Cards */}
            <div className="weather-cards">
                <div className="arrows" onClick={goLeft}>
                    <big><big><big>&#8592;</big></big></big>
                </div>
                {showCard.map(data => {
                    return (
                        <div className="card">
                            <h2>{ data.date }</h2>
                            <p>{ data.weather_description }</p>
                            <img className="card-img" src={"http://openweathermap.org/img/w/" + data.weather_icon + ".png"} alt="weather icon"/>
                            <p className="card-temp">{ data.avg_temp }<span>&#8451;</span></p>
                        </div>
                    )
                })}
                <div className="arrows" onClick={goRight}> 
                    <big><big><big>&#8594;</big></big></big>
                </div>
            </div>
            {/* Hourly Forecast */}
            <div>            
                <h2>{ showHourlyData.date }</h2>
                <div className="hourlyData">
                    {showHourlyData.data.map(data => {
                        return (
                                <li>
                                    <span style={{'color': "hotpink"}}>{ data.time }</span><span>&emsp;</span>
                                    
                                    <span style={{'color': "gold"}}>{ data.weather }<span>&emsp;</span></span>

                                    <span style={{'color': "cyan"}}>min: { data.min_temp }<span>&#8451;</span></span><span>&emsp;</span>

                                    <span style={{'color': "red"}}>max: { data.max_temp }<span>&#8451;</span></span>
                                </li>
                            )
                    })}
                </div>
            </div>
        </div>
      );
}

export default WeatherScreen;
