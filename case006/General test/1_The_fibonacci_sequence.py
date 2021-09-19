""" 
The Fibonacci sequence is defined as a sequence of integers starting with 1 and 1, where each
subsequent value is the sum of the preceding two. I.e.
f(0) = 1
f(1) = 1
f(n) = f(n-1) + f(n-2) where n >= 2
Write a program in a language of your choice to calculate the sum of the first 100 even-valued Fibonacci numbers.
"""

# https://stackoverflow.com/questions/494594/how-to-write-the-fibonacci-sequence
def F(n): # @sandra: This was way too slow.
    if n == 0: return 0
    elif n == 1: return 1
    else: return F(n-1)+F(n-2)

# https://stackoverflow.com/questions/18172257/efficient-calculation-of-fibonacci-series
def fib_to(n): # @sandra: We need to remember previously calculated numbers to eliminate reduntant work.
    fibs = [0, 1]
    for i in range(2, n+1):
        fibs.append(fibs[-1] + fibs[-2])
    return fibs[-1]

sum = 0
for i in range(101): # @sandra: from 0 to 100
    if i % 2 == 0: # @sandra: only for even numbers, please
        sum += fib_to(i)

print('The sum of the first 100 even-valued Fibonacci numbers is:', sum)