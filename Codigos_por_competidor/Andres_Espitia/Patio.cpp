#include<bits/stdc++.h>

using namespace std;

int main(){
	int n;
	string s;
	int cx = 0, co = 0;
	int cant = 0;
	cin>>n>>s;
	
	for(int i=0; i<n; i++){
		if(s[i] == 'X') cx++;
		if(s[i] == 'O') co++;
	}
	int tam = 0;
	for(int i=3; i*i<=n; i++){
		tam = i;
	}
	while(tam>=3){
		int b = 8+(tam-3)*4;
		int r = tam*tam - b;
		int auxcx = cx, auxco = co;
		if(cx>=b && co>=r){
			cant++;
		}
		if(cx>=b && cx-b>=r){
			cant++;
		}
		if(co>=b && cx>=r){
			cant++;
		}
		if(co>=b && co-b>=r){
			cant++;
		}
		tam--;
	}
	cout<<cant;
}

