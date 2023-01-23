#include <bits/stdc++.h>

using namespace std;

int main() {
	int t;
	cin>>t;
	
	for(int i =0;i<t;i++){
		int a;
		cin>>a;
		string aux(to_string(a));
		string auxrev(to_string(a));
		reverse(auxrev.begin(), auxrev.end());
		aux.compare(auxrev) ? cout<<"Case "<<i+1<<": No"<<endl : cout<<"Case "<<i+1<<": Yes"<<endl;
	}
	
	return 0;
}
