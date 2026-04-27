#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin>>t;
	double n, p=0;
	while(t--){
		cin>>n;
		p+= pow(n, 3);
	}
	cout<<setprecision(15);
	cout<<cbrt(p);
}
