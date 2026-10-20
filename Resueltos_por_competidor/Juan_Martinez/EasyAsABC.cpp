/*
 * Autor: Juan Martinez
 * Problema: Easy As ABC (1906A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1906/A
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
const int INF = 1e9;
int posx[8] = {1,0,-1,0,1,-1,-1,1};
int posy[8] = {0,1,0,-1,1,-1,1,-1};
string mini = "ZZZZZZZZZZZ";
vector<vector<char>> letras;
vector<vector<bool>> visited;

void dfs(int x, int y, string aux, vector<vector<bool>>& a) {
    a[x][y] = 1;
    cerr<<aux<<ln;
    if((int)aux.size() == 3) {
        if(aux < mini) mini = aux;
    } else {
        for(int i = 0; i < 8; i++) {
            if(((x+posx[i] >= 0) && (x+posx[i] < 3)) && ((y+posy[i] >= 0) && (y+posy[i] < 3)) && !a[(x+posx[i])][(y+posy[i])]) {
                dfs((x+posx[i]),(y+posy[i]),aux + letras[(x+posx[i])][(y+posy[i])], a);
            }
        }
    }
    a[x][y] = 0;
}

int main() {
    letras.resize(3, vector<char>(3));
    string s;
    for(int i = 0; i < 3; i++) {
        cin>>s;
        for(int j = 0; j < 3; j++) {
            letras[i][j] = s[j];
        }
    }
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            cerr<<i<<" "<<j<<ln;
            visited.assign(3, vector<bool>(3,0));
            dfs(i,j, string(1,letras[i][j]), visited);
        }
    }
    cout<<mini<<ln;
}

