/*
 * Autor: Miguel Lopez
 * Problema: Homework Checker
 * Juez online: OnlineJudge 
 * Veredicto: Accepted
 * Url: https://vjudge.net/contest/821966#problem/A
 */

#include <bits/stdc++.h>
#include <cctype>
#include <cstdio>
#include <ios>
#include <ostream>
#define ln "\n"
typedef long long int ll;
using namespace std;
void init_code() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif 
}
int main() {
    init_code();
    string s;
    int aux = 0;
    while(cin >> s) {
        int pos1 = s.find("+");
        int pos2 = s.find("-");
        int pos = -99;
        if(pos1 != -1) pos = pos1;
        else pos = pos2;
        int l = stoi(s.substr(0, pos));
        int igual = s.find("=");
        string f = s.substr(igual+1, igual - s.length());
        if(f == "?") continue;
        int r = stoi(s.substr(pos+1, igual));
        int res = stoi(s.substr(igual+1, igual - s.length()));
        char c = s[pos];
        if(c == '+') {
            if(res == l + r) aux++;
        }
        else {
            if(res == l - r) aux++;
        }
    }
        cout << aux << ln;
}
