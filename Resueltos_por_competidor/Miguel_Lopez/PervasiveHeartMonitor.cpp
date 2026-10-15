/*
 * Autor: Miguel Lopez
 * Problema: Pervasive Heart Monitor 
 * Juez online: Kattis
 * Veredicto: Accepted
 * Url: https://vjudge.net/contest/821966#problem/F
 */

#include <bits/stdc++.h>
#include <cctype>
#define ln "\n"
#define vi vector<int> 
#define vl vector<ll> 
#define add(x) .push_back(x);
#define debug(x) cerr << x << "<------------ DEBUG" << ln;
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
    while(getline(cin, s)) {
        stringstream ss(s);
        string aux;
        string help = "";
        int cont = 0;
        double res = 0;
        while(ss >> aux) {
            if(!isdigit(aux[0])) {
                help+= aux + " ";
            }
            else {
                cont++;
                double hlp = stod(aux);
                res+=hlp;
            }
        }
        cout << fixed << setprecision(6) << res/cont << " " << help << ln;
    }
    
}
