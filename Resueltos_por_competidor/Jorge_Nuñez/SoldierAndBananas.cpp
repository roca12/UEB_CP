/*
 * Autor: Jorge Nuñez
 * Problema: Soldier and Bananas
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/546/A
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
    
    int t, c,w,sum=0;  cin >> t>>c>>w;
   
   for (int i = 1; i <= w; i++) {
        sum+=i*t;
    }
    int res=sum-c;
    if(res>0){
    cout<<sum-c<<ln;
    }else{
        cout<<0<<ln;
    }
    

  
    
}