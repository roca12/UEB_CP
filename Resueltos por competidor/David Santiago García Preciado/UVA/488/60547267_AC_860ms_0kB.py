num_cases = int(input())

for case in range(num_cases):
    input()
    amp = int(input())
    freq = int(input())

    for f in range(freq):
        # Parte ascendente
        for i in range(1, amp + 1):
            print(str(i) * i)

        # Parte descendente
        for i in range(amp - 1, 0, -1):
            print(str(i) * i)

        if f != freq - 1:
            print()  # Separación entre repeticiones del mismo patrón

    if case != num_cases - 1:
        print()