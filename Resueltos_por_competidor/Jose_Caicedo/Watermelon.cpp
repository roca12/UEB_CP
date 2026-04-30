/*
* Autor: BlackJose17
* Problema: Watermelon
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/4/A
**/

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    if(n % 2==0 && n>2){
        cout<<"YES"<<endl;
    }else{
        cout<<"NO"<<endl;
    }
    return 0;
}

