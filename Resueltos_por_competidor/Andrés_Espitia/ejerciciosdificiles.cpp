#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		int cont = 0;
		while(n--){
			int x;
			cin>>x;
			if(x>=1000) cont++;
		}
		cout<<cont<<endl;
	}
}
