#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin>>t;
	while(t--){
		string s;
		int n;
		int a = 0, b=0;
		cin>>n;
		while(n--){
			cin>>s;
			if(s == "START38") a++;
			else if(s == "LTIME108") b++;
		}
		cout<<a<<" "<<b<<endl;
	}
}
