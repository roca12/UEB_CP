/*
 * Autor: Juan Martinez
 * Problema: Invalid Vote (B)
 * Juez online: AtCoder
 * Veredicto: Accepted
 * Url: https://atcoder.jp/contests/abc480/tasks/abc480_b
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
int main() {
    int n, m, cantidad, dif; cin>>n>>m;
    vector<string> arr(n);
    vector<bool> valido(n, 0);
    map<string,int> indices, votos;
    string s, a, voto;
    for(int i = 0; i < n; i++) {
        cin>>arr[i];
        indices[arr[i]] = i;
    }
    for(int i = 0; i < m; i++) {
        cantidad = 0;
        cin>>a;
        voto = a;
        for(string &b : arr) {
            dif = 0;
            if((a != b) && ((int)(a.size()) == ((int)b.size()))) {
                for(int i = 0; i < (int)a.size(); i++) {
                    if(a[i] != b[i]) dif++;
                }
            } else if(a == b) {
                voto = b;
                cantidad = 1;
                break;
            }
            if(dif == 1) {
                voto = b;
                cantidad++;
            }
        }
        if(cantidad == 1) votos[voto]++;
    }
    for(int i = 0; i < n; i++) {
        cout<<votos[arr[i]]<<ln;
        
    }
}
