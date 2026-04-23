n = int(input())

esferas = list(map(int, input().split()))

autenticas = 0

for estrellas in esferas:
    if 1 <= estrellas <= 7:
        autenticas += 1

print(autenticas)