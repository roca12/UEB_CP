def count_ones_upto(x):
    if x < 0:
        return 0
    count = 0
    i = 0
    while (1 << i) <= x:
        full_cycles = (x + 1) // (1 << (i + 1))
        count += full_cycles * (1 << i)
        remainder = (x + 1) % (1 << (i + 1))
        count += max(0, remainder - (1 << i))
        i += 1
    return count

while True:
    try:
        A, B = map(int, input().split())
        print(count_ones_upto(B) - count_ones_upto(A - 1))
    except EOFError:
        break
