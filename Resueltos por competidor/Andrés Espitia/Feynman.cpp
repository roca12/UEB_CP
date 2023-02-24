#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	int n;
	while(cin>>n && n!=0){
		int imp = 0;
		for(int i=1; i<=n; i++){
			imp += i*i;
		}
		cout<<imp<<endl;
	}
	return 0;
}

