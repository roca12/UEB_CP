/*
 * Autor: Juan Martinez
 * Problema: UCRPC F21 A - Senseless Census
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/DMOJ-ucrpc21a
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
    int n, m, res = 0;
    cin>>n>>m;
    string s;
    for(int i = 0; i < n; i++) {
        cin>>s;
        for(int j = 0; j < m; j++) {
            if(s[j] == 't') res++;
        }
    }
    cout<<res<<ln;
}
