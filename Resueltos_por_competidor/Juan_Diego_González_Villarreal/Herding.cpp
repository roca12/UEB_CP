#include<bits/stdc++.h>
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int n,m;
    cin>>n>>m;
    vector<string> v(n);
    for (int i = 0; i < n; i++) {
        cin>>v[i];
    }
    vector<vector<int>> matriz_estado(n, vector<int>(m,0));
    int trampas = 0, id_ciclo = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            int y = i, x = j;
            id_ciclo++;
            while (true) {
                if (matriz_estado[y][x] == id_ciclo) {
                    trampas++;
                    break;
                }
                if (matriz_estado[y][x] != 0) {
                    break;
                }
                matriz_estado[y][x] = id_ciclo;
                char dir = v[y][x];
                if (dir == 'N') y--;
                else if (dir=='S')y++;
                else if (dir=='E')x++;
                else if (dir=='W')x--;
            }
        }
    }
    cout<<trampas<<endl;
    return 0;
}