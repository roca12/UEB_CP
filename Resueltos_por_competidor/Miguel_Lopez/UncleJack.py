#  Autor: Miguel Lopez
# Problema: Uncle Jack 
# Juez online: OnlineJudge
# Veredicto: Accepted
# Url: https://vjudge.net/problem/UVA-11115


while True:
    a, b = map(int, input().split())
    if a == 0 and b == 0:
        break
    else:
        print(a**b)

