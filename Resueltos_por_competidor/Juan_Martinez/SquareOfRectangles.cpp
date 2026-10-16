/*
 * Autor: Juan Martinez
 * Problema: Square of Rectangles (2120A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2120/problem/A
 * Difficulty: 800
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
int main() {
    int t, l1, l2 , l3, b1, b2, b3; cin>>t;
    while(t--) {
        cin>>l1>>b1>>l2>>b2>>l3>>b3;
        if((l1 == l2 && l2 == l3) && (l1 == (b1+b2+b3))) cout<<"YES"<<ln;
        else if((b1 == b2 && b2 == b3) && (b1 == (l1+l2+l3))) cout<<"YES"<<ln;
        else if(((b1 + b2) == (b1 + b3)) && ((l2 + l3) == l1) && (l1 == (b1+b2))) cout<<"YES"<<ln;
        else if(((b2 + b3) == b1) && ((l1 + l2) == (l1 + l3)) && (b1 == (l1 + l2))) cout<<"YES"<<ln;
        else cout<<"NO"<<ln;
    }
}
