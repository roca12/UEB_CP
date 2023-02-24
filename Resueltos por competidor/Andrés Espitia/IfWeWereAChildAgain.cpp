#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	long long n1, n2;
	string op;
	while(cin>>n1>>op>>n2){
		if(op == "/"){
			cout<<n1/n2;
		}else if(op == "%"){
			cout<<n1%n2;
		}
		cout<<endl;
	}
}

