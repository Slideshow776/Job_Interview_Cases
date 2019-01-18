""" 
Write a python function which, when called with a list of integers, returns the sum of the
squares of all even members of that list.
"""

import random

my_randoms=[]
for i in range (10):
    my_randoms.append(random.randrange(1,101,1))

print(my_randoms)

def sum_of_squares(aList):
    sum = 0
    for element in aList:
        if element % 2 == 0:
            sum += element**2
    return sum

print(sum_of_squares(my_randoms))
