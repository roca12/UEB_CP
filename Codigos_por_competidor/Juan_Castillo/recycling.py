possVals = ['B','C','G']

inp = input().split(' ')
for i, x in enumerate(inp): inp[i] = int(x)

perms = []

def sumPermutation(permString, inp):
    sum = 0
    if permString[0] == 'B': sum += inp[1]+inp[2];
    elif permString[0] == 'C': sum += inp[0]+inp[1];
    elif permString[0] == 'G': sum += inp[0]+inp[2];
    if permString[1] == 'B': sum += inp[4]+inp[5];
    elif permString[1] == 'C': sum += inp[3]+inp[4];
    elif permString[1] == 'G': sum += inp[3]+inp[5];
    if permString[2] == 'B': sum += inp[7]+inp[8];
    elif permString[2] == 'C': sum += inp[6]+inp[7];
    elif permString[2] == 'G': sum += inp[6]+inp[8];
    permTuple = (permString, sum)
    return permTuple

for a in possVals:
    for b in possVals:
        if b != a:
            for c in possVals:
                if c != a and c != b:
                    perms.append(sumPermutation(f"{a}{b}{c}", inp))
                    
perms.sort(key=lambda tup: tup[1])
print(f"{perms[0][0]} {perms[0][1]}")