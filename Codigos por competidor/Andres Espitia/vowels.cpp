#include<bits/stdc++.h>

using namespace std;

int main(){
	string s;
	int n;
	cin>>n;
	while(n--){
		cin>>s;
		bool flag = false;
		for(int i=0; i<s.size()-3; i++){
			if((s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u') && (s[i+1]=='a' || s[i+1]=='e' || s[i+1]=='i' || s[i+1]=='o' || s[i+1]=='u') && (s[i+2]=='a' || s[i+2]=='e' || s[i+2]=='i' || s[i+2]=='o' || s[i+2]=='u')){
				flag =true;
				break;
			}
		}
		
		if(flag) cout<<"Happy";
		else if(!flag) cout<<"Sad";
		cout<<endl;
	}
}
