# Case 13

This case presented me with a *test task* and *two main tasks*:

1. [Test task](#test-task)
2. [Task 1](#task-1)
3. [Task 2](#task-2)

## Test Task
Write a function `function solution(A);` that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example:
* given A = [1, 3, 6, 4, 1, 2], the function should return 5.
* Given A = [1, 2, 3], the function should return 4.
* Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

* N is an integer within the range [1..100,000];
* Each element of array A is an integer within the range [−1,000,000..1,000,000].

### My solution;
This solution did not pass all the test cases, and is incomplete.
```
// Returns the smallest positive integer (greater than 0) that does not occur in A.
function solution(A) {
    let sorted = A.sort(function(a,b){return a - b});
    let smallestPositiveInteger = 1;

    sorted.forEach(number => {
        if (
                number > 0 &&
                (number - 1) != smallestPositiveInteger
            ) { smallestPositiveInteger = number + 1; }
    });    
    return smallestPositiveInteger;
}
```

## Task 1
Days of the week are represented as three-letter strings ("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun").

Write a function `solution` that, given a string `S` representing the day of the week and an integer `K` (between 0 and 500, inclusive), returns the day of the week that is `K` days later.

For example, give `S`="Wed" and `K`=2, the function should return "Fri".

Given `S`="Sat" and `K`=23, the function should return "Mon".

---

### My solution
```
function solution(S, K) {
    let days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"];
    let dayNumber = - 1;
        for (let i = 0; i <= days.length; i++) {
            if (S == days[i])
                dayNumber = i + 1;
        }

    let test = K % 7;
    let test2 = (test + dayNumber) % 7;
    
    return days[test2 - 1];
}
```

## Task 2
### Task description
Your task is to implement a React component that renders a running-clock that will count down time until it reaches 0 minutes and 0 seconds (00:00).

Requirements
Functionality
Given the HTML structure:
```
<label>
    <input type="number">
    Minutes
</label>
<label>
    <input type="number">
    Seconds
</label>

<button>START</button>
<button>PAUSE / RESUME</button>
<button>RESET</button>

<h1 data-testid="running-clock">00:00</h1>
```
Implement a running-clock that receives its time value from user inputs and allows the user to start, pause/resume the countdown and reset the clock.

In order to satisfy the task's requirements, you need to implement the following:

1. **Time display**
    * time is displayed in `<h1 data-testid="running-clock">` and its initial value is 00:00;
    * time is displayed in mm:ss format;
    * 1 minute, 5 seconds should be displayed as: 01:05;
    * 1 minute, 65 seconds should be displayed as: 02:05.

2. **Inputs:**
    * changing input values does not change the value displayed in `<h1 data-testid="running-clock">;`
    * inputs do not need to have max or min attributes;
    * the clock doesn't need to handle negative values; this is not a part of the solution and will not be evaluated.
3. **Behavior:**
    1. On a START button click, set the clock value displayed in `<h1 data-testid="running-clock">` with the time calculated from the inputs and start counting down;
    2. Once the clock is running, update the displayed time every second;
    3. Once the clock is running and the START button is clicked, restart the clock with the same time originally provided in the inputs;
    4. Once the countdown is done and the clock reaches 00:00, stop counting and keep displaying 00:00;
    5. On a PAUSE / RESUME button click, pause or resume the clock appropriately:
        * PAUSE puts the countdown on hold;
        * RESUME resumes the countdown from where it left off;
    6. Once the RESET button is clicked, both inputs should be reset to 0;
    7. Once the RESET button is clicked, the time displayed in `<h1 data-testid="running-clock">` should be reset to 00:00.
### Implementation hints & notice:
Do not clear the inputs on a START button click.
Use the same button element for both pause and resume actions.
The following elements are used in tests and therefore must not be changed:
`<input> labels;`
`<button> texts;`
`<h1>element data-testid attribute value.`
### Hints
Only imports from the react module are allowed.
Your solution will be evaluated based on its correctness.
Design/styling is not assessed and will not affect the score. You should focus only on implementing the requirements.
The Preview tab will display your component. You can use it for testing purposes.
You can use console.log and console.error for debugging purposes via your browser's developer tools.
### Available packages/libraries
React 17.0.1

### Example
![running-clock](https://user-images.githubusercontent.com/4059636/145034775-fbf0c300-d7c4-4026-bbef-7926e86dc992.gif)

### My pseudocode solution
The test environment was lagging so bad *(codility.com)* I could not work in it.

#### Clock Controls
```
  return (
    <Fragment>
      <label id="labelMinutes">
        <input type="number" id="minutes"/>
        Minutes
      </label>
      <label id="labelSeconds">
        <input type="number" id="seconds"/>
        Seconds
      </label>

      <button onClick={start()}>START</button>
      <button onClick={togglePause()}>PAUSE / RESUME</button>
      <button onClick={reset()}>RESET</button>

      <h1 data-testid="running-clock">00:00</h1>
    </Fragment>
  );
}
```

#### Start
```
function start() {
    let min = document.getElementById("minutes");
    let sec = document.getElementById("seconds");

    var countDownDate = new Date();
    newDateObj.setTime(new Date().getTime() + (min * 60 * 1000) + sec * 1000);

    // Update the count down every 1 second
    var x = setInterval(function() {

      // Get today's date and time
      var now = new Date().getTime();
        
      // Find the distance between now and the count down date
      var distance = countDownDate - now;
        
      // Time calculations for minutes and seconds
      var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
      var seconds = Math.floor((distance % (1000 * 60)) / 1000);
        
      // Output the result in an element with id="demo"
      document.getElementById("labelMinutes").innerHTML = minutes + "m ";
      document.getElementById("labelSeconds").innerHTML = seconds + "s ";
        
      // If the count down is over, write some text 
      if (distance < 0) {
        clearInterval(x);
        document.getElementById("labelMinutes").innerHTML = 0 + "m ";
        document.getElementById("labelSeconds").innerHTML = 0 + "s ";
      }
    }, 1000);
  }
```
#### Pause / Resume
```
function togglePause() {
    // know if paused or running using a boolean flag..

    // PAUSED
    // save time values
    let min = document.getElementById("labelMinutes").value;
    let sec = document.getElementById("labelSeconds").value;
    clearInterval(x); // this needs to be a global variable though..

    // RESUME
    // apply values to labels
    document.getElementById("labelMinutes").innerHTML = min + "m ";
    document.getElementById("labelSeconds").innerHTML = sec + "s ";
    // start clock again
    start(min, sec) // this needs to be a global variable though..    
  }
```
#### Reset
```
  function reset() {   
    // reset the clock 
    clearInterval(x); 

    // reset the labels
    document.getElementById("labelMinutes").innerHTML = 0 + "m ";
    document.getElementById("labelSeconds").innerHTML = 0 + "s ";
  }
```


[Go back to the top](#Case-13).
