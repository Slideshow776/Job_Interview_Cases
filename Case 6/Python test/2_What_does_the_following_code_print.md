It prints:
```
[23]
[16, 1, 2]
[[10], 3, 4]
[[11], 23]
```
Because:
* The first line only prints 23 because no other value is passed and lst defaults to an empty list.
* Second line will have 16 first because it is appended to lv at index 0, thus comming first.
* Third line same as second only a list is passed, so the array becomes multidimensional
* Fourth line passes a list with the value 11 