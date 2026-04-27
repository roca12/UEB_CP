# 487-3279: *Nokia Espionage Ringtone plays in the background*

def main():
    DATASET_NUMBER = int(input())
    for dataset in range(0,DATASET_NUMBER):
        input()
        DATASET_ENTRIES = int(input())
        corrected = list()
        for entry in range(0,DATASET_ENTRIES):
            entry = input()
            entry = list(entry.replace('-', ''))
            if len(entry) == 7:
                for i, char in enumerate(entry):
                    if not char.isnumeric():
                        if char == 'A' or char == 'B' or char == 'C':
                            entry[i] = '2'
                        if char == 'D' or char == 'E' or char == 'F':
                            entry[i] = '3'
                        if char == 'G' or char == 'H' or char == 'I':
                            entry[i] = '4'
                        if char == 'J' or char == 'K' or char == 'L':
                            entry[i] = '5'
                        if char == 'M' or char == 'N' or char == 'O':
                            entry[i] = '6'
                        if char == 'P' or char == 'R' or char == 'S':
                            entry[i] = '7'
                        if char == 'T' or char == 'U' or char == 'V':
                            entry[i] = '8'
                        if char == 'W' or char == 'X' or char == 'Y':
                            entry[i] = '9'
                corrected.append("".join(entry))
        counts = []
        while len(corrected) > 0:
            countablelist = [x for x in corrected if corrected[0] == x]
            if len(countablelist) > 1: counts.append((len(countablelist),corrected[0]))
            corrected = [x for x in corrected if corrected[0] != x]
        counts.sort(key=lambda x:x[1])
        if len(counts) > 0:
            for count, number in counts:
                print(number[0:3]+'-'+number[3:7]+' '+str(count))
        else:
            print("No duplicates.")

if __name__ == "__main__":
    main()
