/*
* Autor: BlackJose17
* Problema: Way Too Long Words
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/71/A
**/

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    string s;
    cin>>n;
    while(n--){
    cin >> s;
    int tam=s.size();
        if(tam>10){
            cout << s[0]<<tam-2 <<s[tam-1] << endl;
        }else{
        cout<<s<<endl;
        }
    }
    return 0;
}
