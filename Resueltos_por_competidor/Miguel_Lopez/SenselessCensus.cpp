/*
 * Autor: Miguel Lopez
 * Problema: Senseless Census
 * Juez online: DMOJ
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/DMOJ-ucrpc21a
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
int main() {
    init_code();
    int a,b; cin >> a >> b;
    int cont = 0;
    for(int i = 0; i < a; i++) {
        for(int j= 0; j < b; j++) {
            char s; cin >> s;
            if(s == 't') cont++;
        }
    }
    cout << cont << ln;
}
