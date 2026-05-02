/*
 * Autor: Juan Diego González Villarreal
 * Problema: Merging Intervals
 * Veredicto: Accepted
 * URL: https://codeforces.com/group/c3FDl9EUi9/contest/262795/problem/N
 */

#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
  ll n;
  cin >> n;
  vector<pair<ll, ll>> v(n);
  for (pair<ll, ll>& x : v) cin >> x.first >> x.second;
  sort(v.begin(), v.end());
  ll l = v[0].first, r = v[0].second;
  for (int i = 1; i < v.size(); i++) {
    if (v[i].first <= r)
      r = max(r, v[i].second);
    else {
      cout << l << " " << r << endl;
      l = v[i].first, r = v[i].second;
    }
  }
  cout << l << " " << r << endl;
  return 0;
}