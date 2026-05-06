/*
 * Autor: Juan Martinez
 * Problema: Boy or Girl (236A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/236/A
 */

#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    string s;
    cin>>s;
    set<char> carac;
    for(int i = 0; i < s.length(); i++) carac.insert(s[i]);
    if(carac.size() % 2 == 0) cout<<"CHAT WITH HER!"<<endl;
    else cout<<"IGNORE HIM!"<<endl;
    return 0;
}
