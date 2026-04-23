t = 1

while True:
    entrada = input()

    a, limite = [int(x) for x in entrada.split(" ")]

    if a < 0 and limite < 0:
        break

    A = a
    length = 0

    while a <= limite:
        length += 1
        if a == 1:
            break
        elif a % 2 == 1:
            a = 3 * a + 1
        else:
            a = a // 2

    print(f"Case {t}: A = {A}, limit = {limite}, number of terms = {length}")
    t += 1
