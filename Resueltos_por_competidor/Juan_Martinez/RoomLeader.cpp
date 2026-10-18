/*
 * Autor: Juan Martinez
 * Problema: Room Leader (74A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/74/problem/A
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int n; cin>>n;
    cin.ignore();
    int maximo = -1e9, sum = 0;
    string s, p, aux, temp;
    while(n--) {
        getline(cin, s);
        stringstream ss(s);
        sum = 0;
        int i = 0;
        while(getline(ss, aux, ' ')) {
            if(i == 0) temp = aux;
            else if(i == 1) sum += (stoi(aux) *100);
            else if(i == 2) sum -= (stoi(aux) *  50);
            else sum += stoi(aux);
            i++;
        }
        if(sum > maximo) {
            p = temp;
            maximo = sum;
        }
        //cout<<sum<<ln;
    }
    cout<<p<<ln;
}
