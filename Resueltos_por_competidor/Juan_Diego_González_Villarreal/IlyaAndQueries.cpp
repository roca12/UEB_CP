/*
 * Autor: Juan Diego Gonzalez Villarreal
 * Problema: Ilya and Queries
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/313/problem/B
 */
 #include<bits/stdc++.h>
 #define DBG(X) cerr<<#X<<": "<<(X)<<endl;
 using namespace std;
 int main(){
 	string s;
 	cin>>s;
 	int n = s.size();
 	vector<int> v(n-1), prefix(n);
 	for(int i = 0; i<n-1;i++){
 		v[i] = s[i]==s[i+1]? 1: 0;
 	}
 	prefix[0]=0;
 	for(int i = 1; i<n;i++){
 		prefix[i]=v[i-1]+prefix[i-1];
 	}
 	int m;
 	cin>>m;
 	while(m--){
 		int l,r;
 		cin>>l>>r;
 		l--,r--;
 		cout<<prefix[r]-prefix[l]<<endl;
 	}
 }