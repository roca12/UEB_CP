/*
 * Autor: Juan Martinez
 * Problema: Mishka and Game (703A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/703/problem/A
 */

#include <iostream>

using namespace std;

#define ll long long
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n,m,c;
    int mis, cris;
    mis = 0;
    cris = 0;
    cin>>n;
    while(n--) {
        cin>>m>>c;
        if(m > c) mis++;
        else if(m < c) cris++;
    }
    if(mis > cris) cout<<"Mishka"<<endl;
    else if(mis < cris) cout<<"Chris"<<endl;
    else  cout<<"Friendship is magic!^^"<<endl;
    return 0;
}

