# Autor: Miguel Lopez
# Problema: Integer Inquiry
# Juez online: uHunt
# Veredicto: Accepted
# URL: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=0&problem=365&mosmsg=Submission+received+with+ID+31107062

op = 0
while True:
    numero = int(input())
    if(numero == 0):
        break;
    else:
        op+=numero

print(op)
