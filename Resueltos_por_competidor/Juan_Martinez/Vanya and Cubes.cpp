/*
 * Autor: Juan Martinez
 * Problema: Vanya and Cubes (492A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/492/A
 */

#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n, contador, aux, aux2;
    cin>>n;
    contador = 0;
    aux = 0;
    aux2 = 0;
    for(int i = 1; aux2 < n; i++){
        aux += i;
        if((aux2 + aux) <= n ) {
            aux2 += aux;
            contador++;
        } else {
            break;
        }
    }
    cout<<contador<<endl;
}
