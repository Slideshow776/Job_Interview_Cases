# Task:
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
