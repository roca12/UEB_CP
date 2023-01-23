#include<bits/stdc++.h>

using namespace std;

int main(){
	long long numero1, numero2;
	char op;
	
	while(cin>>numero1>>op>>numero2){
		
		string imp = to_string(numero1) + " " + op + " " + to_string(numero2);
		
		cout<<imp<<endl;
		
		if(numero1>2147483647){
			cout<<"first number too big"<<endl;
		}
		
		if(numero2>2147483647){
			cout<<"second number too big"<<endl;
		}
		
		if((op=='+' && numero1+numero2>2147483647) || (op=='*' && numero1*numero2>2147483647)){
			cout<<"result too big"<<endl;
		}
	}
}
