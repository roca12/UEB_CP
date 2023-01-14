#include<bits/stdc++.h>

using namespace std;

int main(){
	long n1, n2;
	char op;
	while(cin>>n1>>op>>n2){
		if(op=='/') cout<<n1/n2<<endl;
		else cout<<n1%n2<<endl;
	}
}
