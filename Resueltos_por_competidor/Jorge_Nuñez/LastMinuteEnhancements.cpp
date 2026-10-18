/*
 * Autor: Jorge Nuñez
 * Problema: Last minute enhancements
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1466/B
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
      int c; cin>>c;
      
      vi a(c);
      unordered_map<int, int> ca2;
      for(int i=0;i<c;i++){
        cin>>a[i];
      }
      sort(all(a));

      for (int i = 0; i < c; i++) {
    if (ca2[a[i]] == 0) {
        ca2[a[i]]++;
    } else if (ca2[a[i] + 1] == 0) {
        ca2[a[i] + 1]++;
    }
}
    
     cout<<ca2.size()<<ln;

    }

    
}