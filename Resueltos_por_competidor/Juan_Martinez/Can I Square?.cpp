/*
 * Autor: Juan Martinez
 * Problema: Can I Square? (1915C)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1915/C
 */

#include<bits/stdc++.h>

using namespace std;

#define ll long long
int main()
{
    ll n, aux, aux2, num;
    cin>>n;
    while(n--){
        cin>>aux;
        aux2 = 0;
        for(int i = 0; i < aux; i++) {
            cin>>num;
            aux2 += num;
        }
        num = sqrt(aux2);
        if((num * num) == aux2) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
}
