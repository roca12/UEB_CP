#Autor: Alejandra Carvajal
#Problema: Food Balance
#Juez online: CodeChef
#Veredicto: Correct
#URL: https://www.codechef.com/problems/FOODBAL

f1, p1, f2, p2 = map(int, input().split())

first = abs(f1 - p1)
second = abs(f2 - p2)

if first == second:
    print("BOTH")
elif first < second:
    print("FIRST")
else:
    print("SECOND")
