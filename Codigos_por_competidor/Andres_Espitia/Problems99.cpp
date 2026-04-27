#include<bits/stdc++.h>

using namespace std;

int main(){
	int n;
	cin>>n;
	int aux = 0;
	for(int i = n-99; i<=n+99; i++){
		if((i>0) && ((i+1)%100 == 0) && (i!=-1)){
			if(abs(n-i) == abs(i+100 - n)){
				aux = i+100;
			}else if(abs(n-i) >= abs(i+100 - n)){
				aux = i+100;
			}else{
				aux = i;
			}
			break;
		}
	}
	cout<<aux<<endl;
}
