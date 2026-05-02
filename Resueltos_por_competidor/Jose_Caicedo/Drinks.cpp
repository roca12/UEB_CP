/*
* Autor: BlackJose17
* Problema: Drinks
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/200/B
**/

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,b;
    double sum;
    cin>>n;
    for(int i=0; i<n;i++){
        cin>>b;
        sum+=b;
    }
    cout << fixed << setprecision(12) << sum/n << endl;
    return 0;
}
