/*
 * Autor: Juan Diego González Villarreal
 * Problema: Game with Marbles (Hard Version)
 * Juez online: Codeforces
 * Veredicto: Pendiente
 * URL:https://codeforces.com/contest/1914/problem/E2
 */
 #include<bits/stdc++.h>
 typedef long long ll;
 using namespace std;
 int main(){
 	int t;
 	cin>>t;
 	while(t--){
 		int n;
 		cin>>n;
 		vector<ll> a(n),b(n);
 		map<ll,ll> mp;
 		for(int i = 0; i<n; i++)cin>>a[i];
 		for(int i = 0; i<n; i++)cin>>b[i], mp.insert({a[i],b[i]});
 		sort(a.begin(), a.end(), grater<ll>());
 		sort(b.begin(), b.end(), grater<ll>());
 		while(true){
 			bool aFlag = false,bFlag=false;
 			for(int i = 0; i<n; i++){
 				if(mp[b[i]]>0){
 					auto it=lower_bound(a.begin(), a.end(),mp[b[i]]);
 					*it--;
 					mp[b[i]]--;
 				})
 			}
 		}
 	}
 }