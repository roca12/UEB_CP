/*
 * Autor: Jorge Nuñez
 * Problema: BePositive
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2149/A
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
      int sum=0;
      vi a(c);
      for(int i=0;i<c;i++){
        cin>>a[i];
      }
       unordered_map<int, int> ca2;

    for (int x : a) {
        ca2[x]++;
    }
    if(ca2[-1]%2!=0){
        sum+=2;
    }
     if(ca2[0]>0){
        sum+=ca2[0];
     }
     cout<<sum<<ln;

    }

    
}