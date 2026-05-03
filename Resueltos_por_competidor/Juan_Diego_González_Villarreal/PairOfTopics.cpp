/*
 * Autor: Juan Diego González Villarreal
 * Problema: Pair of Topics
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/1324/problem/D
 */
#include<bits/stdc++.h>
#define DBG(X) cout<<#X<<": "<<(X)<<endl
typedef long long ll;
using namespace std;

int main(){
	int n;
	cin>>n;
	vector<ll> a(n),b(n),c(n);
	for(ll &x:a) cin>>x;
	for(int i = 0; i<n;i++){
		cin>>b[i];
		c[i]=a[i]-b[i];
	}
	sort(c.begin(), c.end();
	ll ans = 0;
	for(int i = 0; i<v.size();i++){
		if(c[i]<=0) continue;
		ll pos = lower_bound(c.begin(), c.end(), -c[i]+1)-c.begin();
		ans+=i-pos;
	}
	cout<<ans<<endl;
	return 0;
}
