/*
 * Autor: Juan Martinez
 * Problema: Black Friday
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/Kattis-blackfriday
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
    int n, aux; cin>>n;
    vector<int> arr(n);
    map<int,int> mapa;
    for(int i = 0; i < n; i++) {
        cin>>aux;
        arr[i] = aux;
        mapa[aux]++;
    }
    int maximo = -1;
    for(auto [val,cant]: mapa) {
        if(cant == 1) maximo = max(maximo, val);
    }
    if(maximo != -1) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == maximo) {
                cout<<i+1<<ln;
                break;
            }
        }
    } else cout<<"none"<<ln;
}
