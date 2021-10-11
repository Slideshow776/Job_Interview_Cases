1. [Introductory Task](#introductory-task)
2. [Main Task](#main-task)

# Introductory Task:
*Find the longest word in `words` whose letters are in alphabetic order.*

For example:

* "for" is an alpha word -- "f" is before "o" is before "r"
* "while" is *not* an alpha word -- "w" is after "h"

# My solution:
```
function findLongestAlphaWord(words) {
  console.log("Words: ", words);
    
  var longestWord = words[0];
  var alphabeticOrder = true;
  words.forEach(element => {
  for (let i = 0; i < element.length; i++) {
    if (element.charAt(i) < element.charAt(i + 1))
      alphabeticOrder = false;
    }
    if (element.length > longestWord.length && alphabeticOrder)
      longestWord = element;
    });
    
    console.log("longestWord: ", longestWord);
    return longestWord;
}
```

# Main Task
Build a basic Weather app. Aim to spend no more than two hours on this.

The WeatherApp contains two screens:
1. Loading screen
2. Weather info screen

## Loading Screen
The loading screen is the first screen that is shown when the app is being opened. Also this screen should be shown when fetching the weather data.

You can use [OpenWeatherMap](https://home.openweathermap.org/users/sign_up) to obtain weather information.

## Weather Screen

This screen should show the weather forecast for Oslo.
Example request: `https://api.openweathermap.org/data/2.5/forecast?q={city name}&appid={API key}`
Docs: https://openweathermap.org/forecast5 

This screen should contain:
* Should fetch the weather forecast for next following 5 days and show the loading screen while fetching
* Display the temperature for up to 3 days
* Left and Right arrows to get the temperature for next/prev day
* Below the arrows, a maximum of 3 weather cards should be visible. Each card should display the weather forecast for that day and the average temperature
* Bellow the weather cards, the hourly forecast should be shown for the selected day. You should show the hour, weather, min and max temperatures.

## Non-goals
* Unit tests
* Responsive Interface