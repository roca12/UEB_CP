/*
 * Autor: Juan Diego González Villarreal
 * Problema: Registration system
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL: http://codeforces.com/problemset/problem/4/C
 */
 #include<bits/stdc++.h>
 #define DBG(X) cerr<<#X<<": "<<(X)<<endl
 using namespace std;
 int main(){
 	int n;
 	cin>>n;
 	map<string, int> names;
 	for(int i = 0; i<n; i++){
 		string name;
 		cin>>name;
 		if(names.find(name)==names.end()){
 			cout<<"OK"<<endl;
 			names.insert({name, 0});
 			continue;
 		}
 		names[name]++;
 		cout<<name+to_string(names[name])<<endl;
 	}
 }
 