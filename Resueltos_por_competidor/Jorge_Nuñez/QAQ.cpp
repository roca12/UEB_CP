/*
 * Autor: Jorge Nuñez
 * Problema: QAQ
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/894/A
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

    string a; 
    cin>>a;
     ll q = 0, ans = 0, qt =0;

     for (int i = 0; i < a.length(); i++) {
        if (a[i] == 'Q') {
            qt++;
        }
    }

     for (int i = 0; i < a.length(); i++) {
    if (a[i] == 'Q') {
        q++;
    } else if (a[i] == 'A') {
        ans += q * (qt - q);
    }
} 

      cout<<ans<<ln;

}