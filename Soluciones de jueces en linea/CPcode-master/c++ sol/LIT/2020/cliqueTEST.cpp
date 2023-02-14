#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <map>
using namespace std;
#define endl '\n'
#define ll long long
#define pi pair<ll, ll>
#define f first
#define s second

const int mod = 1000000007;
const int mxn = 20;
int n, m;
ll a[mxn], vis[mxn];
map<ll, ll, greater<ll>> dp;
vector<int> g[mxn];

void dfs(int c){
	vis[c] = 1;
	for(int i : g[c]) dfs(i);
}

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	cin >> n >> m;
	
	for(int i = 0; i < n; i++) cin >> a[i];
	for(int i = 0; i < m; i++){
		int u, v;
		cin >> u >> v;
		if(u < v) swap(u, v);
		g[--u].push_back(--v);
	}
	
	dfs(n - 1);
	
	ll ret = 1;
	for(int i = 1; i < n; i++){
		if(!vis[i]) continue;
		dp.clear();
		dp[0] = 1;
		for(int j : g[i])
		for(pi k : dp)
		for(ll l = a[j]; l + k.f <= a[i]; l += a[j]){
			(dp[k.f + l] += k.s) %= mod;
		}
		(ret *= dp[a[i]]) %= mod;
	}
	
	cout << ret << endl;

	return 0;
}