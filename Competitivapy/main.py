import random
lista=[]
for i in range(10):
    lista.append(random.randint(0,10))
lista.append("halo")
lista.append(True)
lista.insert(4,"nuevo")
print(lista)