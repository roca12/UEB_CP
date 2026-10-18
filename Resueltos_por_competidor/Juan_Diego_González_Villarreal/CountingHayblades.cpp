/*
 * Autor: Juan Diego Gonzalez Villarreal
 * Problema: Counting Hayblades
 * Juez Online: USACO
 * Veredicto: Accepted
 * URL: https://usaco.org/index.php?page=viewproblem2&cpid=666
 */

#include <bits/stdc++.h>
typedef long long ll;
typedef unsigned long long ull;
#define pq priority_queue
#define DBG(X) cerr << #X << ": " << (X) << endl
#define mp make_pair
#define vll vector<ll>
#define pll pair<ll, ll>
#define pb push_back
#define vi vector<int>
#define vvi vector<vi>
#define pii pair<int, int>
#define pll pair<ll, ll>
#define all(v) v.begin(), v.end()
#define um unordered_map
#define mm multimap
#define ms multiset
#define in insert
#define vpii vector<pii>
#define vb vector<bool>
#define ln "\n"
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  freopen("haybales.in", "r", stdin);
  freopen("haybales.out", "w", stdout);
  int n, q;
  cin >> n >> q;
  vll v(n);
  for (ll &x : v) {
    cin >> x;
  }
  sort(all(v));
  auto at_most = [&](int x) {
    int lo = 0, hi = n;
    while (lo < hi) {
      int mid = (lo + hi) / 2;
      if (v[mid] <= x) {
        lo = mid + 1;
      } else {
        hi = mid;
      }
    }
    return lo;
  };
  for (int i = 0, a, b; i < q; i++) {
    cin >> a >> b;
    cout << at_most(b) - at_most(a - 1) << ln;
  }
}