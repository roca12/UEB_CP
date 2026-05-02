# Autor: Miguel Lopez
# Problema: Is this Fibonacci
# Juez online: Codeforces
# Veredicto: Accepted 
# URL: https://codeforces.com/gym/106307/problem/F


import math
 
def is_perfect_square(x):
    if x < 0:
        return False
    s = math.isqrt(x)
    return s*s == x
 
def is_fibonacci(n):
    return is_perfect_square(5*n*n + 4) or is_perfect_square(5*n*n - 4)
 
t = int(input())
n = int(input())
 
if is_fibonacci(n): 
        print("YES")
else:
        print("NO")
  
