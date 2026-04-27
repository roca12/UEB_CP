#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin>>t;
	int sum = 0;
	int imp = 0;
	while(t--){
		int n;
		cin>>n;
		sum += n;
		if(sum < 0 && imp<abs(sum)){
			imp = abs(sum);
		}	
	}
	cout<<imp<<endl;
}
