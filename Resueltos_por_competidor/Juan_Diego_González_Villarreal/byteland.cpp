/*
 * Autor: Juan Diego Gonzalez Villarreal
 * Problema: Bytelandian gold coins
 * Juez online: Codechef
 * Veredicto: Accepted
 * URL:https://vjudge.net/problem/CodeChef-COINS/origin
 */
 #include<bits/stdc++.h>
 typedef long long ll;
 using namespace std;
 
 map<ll,ll> memo;
 
 ll convert(ll val){
 	ll n2=val/2,n3=val/3,n4=val/4;
 	if(n2+n3+n4<=val) return val;
 	if(memo[val]) return memo[val];
 	ll ans = max(convert(n2)+convert(n3)+convert(n4), val);
 	memo[val]=ans;
 	return ans;
 }
 
 int main(){
 	ll num;
 	while(cin>>num){
 		cout<<convert(num)<<endl;
 	}
 }