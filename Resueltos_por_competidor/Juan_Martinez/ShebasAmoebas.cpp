/*
 * Autor: Juan Martinez
 * Problema: Sheba's Amoebas
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/Kattis-amoebas
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
int a, b, res = 0;
vector<vector<bool>> visited;
vector<vector<char>> adj;
int posx[8] = {1, 0, -1, 0, 1, -1, 1, -1};
int posy[8] = {0, 1, 0, -1, 1, -1, -1, 1};

void dfs(int x, int y) {
    visited[x][y] = 1;
    for(int i = 0; i < 8; i++) {
        if((x+posx[i]) == a || (x+posx[i] == -1)) continue;
        if((y+posy[i]) == b || (y+posy[i] == -1)) continue;
        if(!visited[(x+posx[i])][(y+posy[i])] && adj[(x+posx[i])][(y+posy[i])] == '#') dfs((x+posx[i]), (y+posy[i]));
    }
}

int main() {
    cin>>a>>b;
    adj.resize(a, vector<char>(b));
    visited.resize(a, vector<bool>(b, 0));
    string s;
    for(int i = 0; i < a; i++) {
        cin>>s;
        for(int j = 0; j < b; j++) {
            adj[i][j] = s[j];
        }
    }
    for(int i = 0; i < a; i++) {
        for(int j = 0; j < b; j++) {
            if(!visited[i][j] && adj[i][j] == '#') {
                //cout<<i<<" "<<j<<ln;
                res++;
                dfs(i, j);
            }
        }
    }
    cout<<res<<ln;
}
    
