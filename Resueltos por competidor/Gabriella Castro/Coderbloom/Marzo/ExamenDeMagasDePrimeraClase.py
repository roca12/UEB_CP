import sys

def resolver():
    input_data = sys.stdin.read().split()
    if not input_data:
        return

    n = int(input_data[0])
    m = int(input_data[1])

    total_stille = {}
    frecuencia_captura = {}

    idx = 2
    for _ in range(m):
        tipo = input_data[idx]
        if tipo == "CAPTURA":
            p = int(input_data[idx + 1])
            k = int(input_data[idx + 2])
            
            total_stille[p] = total_stille.get(p, 0) + k
            frecuencia_captura[p] = frecuencia_captura.get(p, 0) + 1
            idx += 3
            
        elif tipo == "ROBO":
            p = int(input_data[idx + 1])
            q = int(input_data[idx + 2])
            k = int(input_data[idx + 3])

            tiene_q = total_stille.get(q, 0)
            robado = min(k, tiene_q)
            
            total_stille[q] = tiene_q - robado
            total_stille[p] = total_stille.get(p, 0) + robado
            idx += 4

    ganador = 1
    max_stille = total_stille.get(1, 0)
    max_freq = frecuencia_captura.get(1, 0)

    participantes_activos = set(total_stille.keys()) | set(frecuencia_captura.keys())

    for id_mago in participantes_activos:
        actual_stille = total_stille.get(id_mago, 0)
        actual_freq = frecuencia_captura.get(id_mago, 0)

        if actual_stille > max_stille:
            max_stille, max_freq, ganador = actual_stille, actual_freq, id_mago
        elif actual_stille == max_stille:
            if actual_freq > max_freq:
                max_freq, ganador = actual_freq, id_mago
            elif actual_freq == max_freq:
                if id_mago < ganador:
                    ganador = id_mago

    print(ganador)

if __name__ == "__main__":
    resolver()