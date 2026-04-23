line=input()
chain = ""
while (True):
    line=input()
    if line=="___________":
        break
    line = line.replace("|","")
    line = line.replace(".", "")
    line = line.replace("o", "1")
    line = line.replace(" ", "0")
    value=int(line,2)
    #print(value,"-->", chr(value))
    #if value != 13:
    #if value >= 0 and value <=31:
        #print("")
    #else:
    chain = chain + chr(value)
    #print(chr(value),end="")
    #end = "" evita salto de linea
        
print(chain, end="")
        