#include<bits/stdc++.h>

using namespace std;

int main(){
	int n = 0, nmax = 0;
	string s;
	cin>>s;
	for(int i=0; i<s.size(); i++){
		if(s[i]=='0'){
			n++;
		}else{
			if(nmax<n){
				nmax = n;
			}
			n=0;
		}
	}
	
	if(nmax % 2 == 0) n=nmax/2;
	else n = (nmax/2)+1;
	
	cout<<n<<endl;
}
