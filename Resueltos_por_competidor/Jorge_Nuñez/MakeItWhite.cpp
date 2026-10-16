
/*
 * Autor: Jorge Nuñez
 * Problema: Make it White
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1927/A
 */

#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int>
#define vll vector<ll>
#define vp vector<pair<ll , ll>>
#define dbg(x) cerr << x << " <-----" << "DEBUG" << ln;
using namespace std;
typedef long long int ll;
#define all(x) (x).begin(), (x).end()
#define add(x) push_back(x)
const int INF = 1e9;
int main() {
    ios::sync_with_stdio(false);
	cin.tie(nullptr);
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--) {
        int n;
        string s;
        cin >> n >> s;

        int inicio = -1;
        int fin = -1;

        for (int i = 0; i < n; i++) {
            if (s[i] == 'B') {
                if (inicio == -1) {
                    inicio = i;
                }
                fin = i;
            }
        }

        cout << fin - inicio + 1 << ln;
    }

    
}
