/*
 * Autor: Juan Diego González Villarreal
 * Problema: Homo or Hetero
 * Juez online: SPOJ
 * Veredicto: Accepted
 * URL:https://vjudge.net/problem/SPOJ-HOMO/origin
 */
 #include<bits/stdc++.h>
 typedef long long ll;
 #define DBG(X) cerr<<#X<<": "<<(X)<<endl
 using namespace std;
 
 int main(){
 	int t;
 	cin>>t;
 	unordered_map<ll,ll> mp;
 	ll dup = 0, dist = 0;
 	while(t--){
 		string com;
 		ll num;
 		cin>>com>>num;
 		if(com=="insert"){
 			mp[num]++;
 			if(mp[num]==1) dist++;
 			if(mp[num]==2) dup++;
 		}else{
 			if(mp[num]>0){
 			    if(mp[num]==2)dup--;
 			    mp[num]--;
 			    if(mp[num]==0)dist--;
 			}
 		}
 		bool hetero = dist>1;
 	 	bool homo = dup>0;
 		if(hetero && homo) cout<<"both"<<endl;
 		else if(!hetero && !homo) cout<<"neither"<<endl;
 		else if(hetero && !homo) cout<<"hetero"<<endl;
 		else if(!hetero && homo) cout<<"homo"<<endl;
 	}
 } 