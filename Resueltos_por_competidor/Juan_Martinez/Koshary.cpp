/*
 * Autor: Juan Martinez
 * Problema: Koshary (2227A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2227/problem/A
 */

#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, x, y;
    cin>>n;
    while(n--) {
        cin>>x>>y;
        if((x%2 != 0) && (y%2 != 0)) cout<<"NO"<<endl;
        else  cout <<"YES"<< endl;
    }

    return 0;
}
