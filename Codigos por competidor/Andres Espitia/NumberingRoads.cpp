#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	int r, n;
	int caso = 1;
	while(cin>>r>>n){
		if(r == 0 && n == 0) break;
		cout<<"Case "<<caso<<": ";
		bool flag = false;
		for(int i=0; i<=26; i++){
			if((i+1)*n >= r){
				flag = true;
				cout<<i<<endl;
				break;
			}
		}
		if(!flag) cout<<"impossible"<<endl;
		caso++;
	}
	return 0;
}

