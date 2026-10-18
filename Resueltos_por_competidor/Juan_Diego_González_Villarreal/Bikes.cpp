/*
 * Autor: Juan Diego Gonzalez Villarreal
 * Problema:
 * Juez Online:
 * Veredicto: Accepted
 * URL:
 */

#include <bits/stdc++.h>
#include <iomanip>
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
#define t tuple<int, int, int, int>
#define vt vector<t>
#define ln "\n"
using namespace std;

int main() {
  ios_base::sync_with_stdio(false);
  cin.tie(nullptr);
  int n;
  cin >> n;
  double ans = -1.0;
  for (int i = 0; i < n; i++) {
    "" double x1, y1, x2, y2;
    cin >> x1 >> y1 >> x2 >> y2;
    if (x1 * x2 >= 0)
      continue;
    double y = y1 - x1 * (y2 - y1) / (x2 - x1);
    if (y > 0 && (ans < 0 || y < ans))
      ans = y;
  }
  cout << fixed << setprecision(10) << ans << ln;
}