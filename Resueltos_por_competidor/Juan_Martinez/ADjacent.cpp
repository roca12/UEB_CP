/*
 * Autor: Juan Martinez
 * Problema: ADjacent (A)
 * Juez online: AtCoder
 * Veredicto: Accepted
 * Url: https://atcoder.jp/contests/abc480/tasks/abc480_a
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
int main() {
    string a, b;
    cin>>a>>b;
    if(a[0] == 'A' && (a[1] == 'D' || b[0] == 'D')) cout<<"Yes"<<ln;
    else if(a[1] == 'A' && (a[0] == 'D' || b[1] == 'D')) cout<<"Yes"<<ln;
    else if(b[0] == 'A' && (a[0] == 'D' || b[1] == 'D')) cout<<"Yes"<<ln;
    else if(b[1] == 'A' && (a[1] == 'D' || b[0] == 'D')) cout<<"Yes"<<ln;
    else cout<<"No"<<ln;
}
