#include<bits/stdc++.h>

using namespace std;

int main(){
	int t, n;
	cin>>t;
	while(t--){
		cin>>n;
		int a[n];
		for(int i=0; i<n; i++){
			cin>>a[i];
		}
		
		int max, maxaux = 0;
		for(int i=0; i<n; i++){
			max = 0;
			for(int j=0; j<n; j++){
				if(a[i]==a[j]){
					max++;
				}
			}
			if(max>maxaux) maxaux = max;
		}
		
		cout<<n-maxaux<<endl;
	}
}
