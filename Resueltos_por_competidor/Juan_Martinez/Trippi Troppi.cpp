/*
 * Autor: Juan Martinez
 * Problema: Trippi Troppi. (2094A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2094/A
 */
#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    string palabra;
    cin>>n;
    while(n--) {
    stringstream ss;
        for(int i = 0; i < 3; i++) {
        cin>>palabra;
        ss<<palabra[0];
        }
        cout<<ss.str()<<endl;
    }
    return 0;
}
