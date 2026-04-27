#include<bits/stdc++.h>

using namespace std;

int divisores(int n){
	int aux;
	if(n%3!=0) aux = (n/3) + 1;
	else aux = n/3;
	
	return n-aux;
}

int main(){
	int caso = 1;
	int t;
	cin>>t;
	while(t--){
		int a, b;
		cin>>a>>b;
		cout<<"Case "<<caso<<": "<<divisores(b)-divisores(a-1)<<endl;
		caso++;
	}
	
}
