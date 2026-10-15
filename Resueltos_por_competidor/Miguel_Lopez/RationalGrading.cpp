/*
 * Autor: Miguel Lopez
 * Problema: Rational Grading
 * Juez online: OnlineJudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/contest/821961#problem/D
 */

#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int> 
#define vl vector<ll> 
#define add(x) .push_back(x);
#define debug(x) cerr << x << "<------------ DEBUG" << ln;
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
signed main() {
    init_code();
    while(true) {
        string s; int t; cin >> s >> t;
        if(s == "0" && t == 0) break;
        int cont = 0;

        if(s[0] != '0') {                             
            int hlp = stoi(s);
            while(t--) {
                string aux; int n; cin >> aux >> n;
                if(aux == "++i") {
                    if(n == hlp+1) cont++;
                    hlp = n;
                }
                else if(aux == "i++") {
                    if(n == hlp) cont++;
                    hlp = n+1;
                }
                else if(aux == "--i") {
                    if(n == hlp-1) cont++;
                    hlp = n;
                }
                else if(aux == "i--") {
                    if(n == hlp) cont++;
                    hlp = n-1;
                }
                else {                    
                    if(n == hlp) cont++;
                    hlp = n;
                }
            }
        }
        else if(s.size() > 1 && (s[1] == 'x' || s[1] == 'X')) {         
            int dec = stoi(s, nullptr, 16);
            while(t--) {
                string aux; int n; cin >> aux >> n;
                if(aux == "++i") {
                    if(n == dec+1) cont++;
                    dec = n;
                }
                else if(aux == "i++") {
                    if(n == dec) cont++;
                    dec = n+1;
                }
                else if(aux == "--i") {
                    if(n == dec-1) cont++;
                    dec = n;
                }
                else if(aux == "i--") {
                    if(n == dec) cont++;
                    dec = n-1;
                }
                else {                     
                    if(n == dec) cont++;
                    dec = n;
                }
            }
        }
         else {                                         
            int dec = stoi(s, nullptr, 8);
            while(t--) {
                string aux; int n; cin >> aux >> n;
                if(aux == "++i") {
                    if(n == dec+1) cont++;
                    dec = n;
                }
                else if(aux == "i++") {
                    if(n == dec) cont++;
                    dec = n+1;
                }
                else if(aux == "--i") {
                    if(n == dec-1) cont++;
                    dec = n;
                }
                else if(aux == "i--") {
                    if(n == dec) cont++;
                    dec = n-1;
                }
                else {                     
                    if(n == dec) cont++;
                    dec = n;
                }
            }
        }
        cout << cont << ln;
    }
}
