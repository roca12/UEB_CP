#include<bits/stdc++.h>

using namespace std;

int main(){
	string s1, s2;
	int pos = 0;
	cin>>s1>>s2;
	int cont = 1;
	while(pos<4){
		if(s1[pos] != s2[pos]){
			cont*=2;
		}
		pos++;
	}
	cout<<cont<<endl;
}
