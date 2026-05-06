/*
 * Autor: Juan Diego González Villarreal
 * Problema: Missing Number
 * Juez online: CSES
 * Veredicto: Accepted
 * URL:https://cses.fi/problemset/task/1083
 */
 #include<bits/stdc++.h>
 using namespace std;
 
 int main(){
 	int n;
 	cin>>n;
 	set<int> s;
 	for(int i = 0; i< n;i++){
 		int tmp;
 		cin>>tmp;
 		s.insert(tmp);
 	}
 	auto it = s.begin();
 	for(int i = 1;i<=n;i++){
 		if(*it==i){
 			++it;
 		}else{
 			cout<<i<<endl;
 			break;
 		}
 	}
 }
 