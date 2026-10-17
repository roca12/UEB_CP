/*
 * Autor: Juan Martinez
 * Problema: Game of Throwns
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/Kattis-throwns
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
#define add(x) push_back(x)

int mod(int a, int b){
    return (a - (b*(floor(((double)a/(double)b)))));
}

int main() {
    int n, k, num, m, act = 0;
    cin>>n>>k;
    string s;
    cin.ignore();
    getline(cin, s);
    stringstream ss(s);
    string aux;
    vector<int> arr;
    //cout<<s<<ln;
    while(getline(ss, aux, ' ')) {
        //cout<<act<<ln;
        if(aux.empty()) continue;
        if(aux[0] == 'u') {
            getline(ss, aux, ' ');
            m = stoi(aux);
            while(m--) {
                if(arr.empty()) break;
                act -= arr.back();
                act = mod(act, n);
                arr.pop_back();
            }

        } else {
            arr.add(stoi(aux));
            act += stoi(aux);
            act = mod(act, n);
        }
    }
    cout<<act<<ln;
    
}
