'''
 * Autor: Juan Martinez
 * Problema: DRM Messages 
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/Kattis-drmmessages
'''
import string
ALPHA = string.ascii_uppercase
msj = input()
sum1 = 0
sum2 = 0
msj_decifradoParte1 = ""
msj_decifradoParte2 = ""
msj_decifradoRealNoFake = ""

for i in range((len(msj)//2)):
    sum1 += ALPHA.find(msj[i])
    sum2 += ALPHA.find(msj[(i+(len(msj)//2))])
for i in range(len(msj)):
    if i < (len(msj)//2):
        msj_decifradoParte1 += ALPHA[(ALPHA.find(msj[i])+sum1) % len(ALPHA)]
    else:
        msj_decifradoParte2 += ALPHA[(ALPHA.find(msj[i])+sum2) % len(ALPHA)]

for i in range(len(msj_decifradoParte1)):
    msj_decifradoRealNoFake += ALPHA[(((ALPHA.find(msj_decifradoParte1[i])) + (ALPHA.find(msj_decifradoParte2[i]))) % len(ALPHA))]

print(msj_decifradoRealNoFake)
