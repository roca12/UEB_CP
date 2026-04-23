line=input()
while (True):
    line=input()
    if line=="___________":
        break
    line = line.replace("|","")
    line = line.replace(".", "")
    line = line.replace("o", "1")
    line = line.replace(" ", "0")
    value=int(line,2)
    if value == 13:
        print("")
    else:
        print(chr(value)+"",end="")