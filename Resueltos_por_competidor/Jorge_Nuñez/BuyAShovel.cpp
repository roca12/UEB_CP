/*
 * Autor: Jorge Nuñez
 * Problema: Buy a Shovel
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/732/A
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
    
    int t, c;  cin >> t>> c;
   
   for (int i = 1; i <= 10; i++) {
        int total = t * i;
       
        if (total % 10 == 0 || total  % 10 == c) {
            cout << i << ln;
            break;
        }
    }
    

  
    
}