import math

def factorial_digit(number):
    if number == 0 or number == 1:
        return 1
    x = (number * math.log10(number / math.e)) + (math.log10(2 * math.pi * number) / 2.0)
    return int(math.floor(x)) + 1

cases = int(input()) 
for i in range(cases):
    number = int(input())
    print(factorial_digit(number))