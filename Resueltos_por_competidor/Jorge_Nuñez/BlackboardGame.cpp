/*
 * Autor: Jorge Nuñez
 * Problema: Blackboard Game
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2123/A
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
    
    int t;
    cin >> t;

    while (t--) {
      int n; cin>>n;

      if (n % 4 == 0) {
        cout << "Bob"<<ln;
    } else {
        cout << "Alice"<<ln;
    }

    }

    
}