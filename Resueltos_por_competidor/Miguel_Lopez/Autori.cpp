/*
 * Autor: Miguel Lopez
 * Problema: Autori
 * Juez online: Kattis
 * Veredicto: Accepted
 * Url: https://vjudge.net/contest/821966#problem/E
 */

#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int> 
#define vl vector<ll> 
#define add(x) .push_back(x);
#define dbg(x) cerr << x << "<------------ DEBUG" << ln;
typedef long long int ll;
const int INF = int(1e9) + 5;
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
    string s; getline(cin, s);
    stringstream ss(s);
    string aux;
    //ss >> aux;
    string res = "";
    while(getline(ss, aux, '-')) {
        res+=aux[0];
    }
    cout << res << ln;
}
