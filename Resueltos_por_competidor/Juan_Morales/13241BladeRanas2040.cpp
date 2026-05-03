/*
 * Autor: OtherSpanish
 * Problema: Blade Ranas 2040
 * Juez online: UVA
 * Veredicto: Accepted
 * URL: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=24&page=show_problem&problem=5164
 */

#include <bits/stdc++.h>

using namespace std; 

// Cuantos replicantes ve la rana desde la posicion (fil, col)
int contarReplicantes(const vector<string>& mapa, int fil, int col, int filas, int cols) {

    if (mapa[fil][col] == '#') return 0; // Si es una pared, la rana no puede estar

    int cuenta = 0; //Se van sumando los replicantes que ve la rana

    // Las 8 direcciones en las que la rana puede mirar
    int dirs[8][2] = { {-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1} };

    for (int d = 0; d < 8; d++) {                  // Se mira en cada una de las 8 direcciones
        int nf = fil + dirs[d][0];                 // Fila de la siguiente pos en esta direccion
        int nc = col + dirs[d][1];                 // Columna de la siguiente pos en esta direccion
        while (nf >= 0 && nf < filas && nc >= 0 && nc < cols) { // Mientras no se acabe el grid
            if (mapa[nf][nc] == '#') break;        // Una pared bloquea la vision, se deja de mirar en esta direccion
            if (mapa[nf][nc] == 'R') cuenta++;     // Hay un replicante, se cuenta
            nf += dirs[d][0];                      // Se avanza una pos mas en esta direccion
            nc += dirs[d][1];                      // Se avanza una pos mas en esta direccion
        }
    }

    if (mapa[fil][col] == 'R') cuenta++; // Si la rana esta encima de un replicante tambien cuenta

    return cuenta; // Se devuelve el total de replicantes que ve la rana
}

int main() {

    int T;       // Casos de prueba
    cin >> T;  

    for (int t = 0; t < T; t++) { 
        int F, C;                  // F = filas del mapa, C = columnas del mapa
        cin >> F >> C;          

        vector<string> mapa(F);       
        for (int i = 0; i < F; i++)    // Se lee cada fila
            cin >> mapa[i];           

        int mejor = -1; // La mejor cantidad de replicantes 
        int mejF = 0; // Fila de la mejor posicion
        int mejC = 0; // Columna de la mejor posicion

        for (int f = 0; f < F; f++) {              // Se prueba cada fila
            for (int c = 0; c < C; c++) {          // Se prueba cada columna
                int cnt = contarReplicantes(mapa, f, c, F, C); // Cuantos replicantes ve la rana desde (f, c)
                if (cnt > mejor) {  // Si ve mas que el mejor hasta ahora
                    mejor = cnt;    // Se guarda el nuevo maximo
                    mejF = f;      // Se guarda la fila
                    mejC = c;      // Se guarda la columna
                }
            }
        }

        cout << mejF + 1 << " " << mejC + 1 << "\n"; // Se imprime la posicion
    }

}
