/*
 * Autor: Juan Diego González Villarreal
 * Problema: Two-Gram
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL:https://codeforces.com/contest/977/problem/B
 */
 #include<bits/stdc++.h>
 using namespace std;
 
 int main(){
 	int n;
 	cin>>n;
 	map<string, int> f;
 	string s;
 	cin>>s;
 	for(int i = 0; i<n-1; i++){
 		string tmp = s.substr(i,2);
 		if(f.find(tmp)!=f.end())continue;
 		f[tmp]=1;
 		for(int j = i; j<n-1;j++){
 			if(tmp==s.substr(j,2))f[tmp]++;
 		}
 	}
 	string ans;
 	for(pair<string,int> p:f){
 		if(p.second > f[ans])ans = p.first;
 	}
 	cout<<ans<<endl;
 }