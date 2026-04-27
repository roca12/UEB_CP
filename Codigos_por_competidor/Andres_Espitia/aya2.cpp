#include <bits/stdc++.h>

using namespace std;

int main()
{
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		string s, f="--------";
		vector<string> def;
		vector<string> total;
		for(int it=0; it<n; it++){
			cin>>s;
			int j=0;
			for(int i=0; i<s.size();i++){
				if(j==3) j++;
				if(s[i]=='A' || s[i]=='B' || s[i]=='C' || s[i]=='2'){
					f[j]='2';
					j++;
				}
				else if(s[i]=='D' || s[i]=='E' || s[i]=='F' || s[i]=='3'){
					f[j]='3';
					j++;
				}
				else if(s[i]=='G' || s[i]=='H' || s[i]=='I' || s[i]=='4'){
					f[j]='4';
					j++;
				}
				else if(s[i]=='J' || s[i]=='K' || s[i]=='L' || s[i]=='5'){
					f[j]='5';
					j++;
				}
				else if(s[i]=='M' || s[i]=='N' || s[i]=='O' || s[i]=='6'){
					f[j]='6';
					j++;
				}
				else if(s[i]=='P' || s[i]=='R' || s[i]=='S' || s[i]=='7'){
					f[j]='7';
					j++;
				}
				else if(s[i]=='T' || s[i]=='U' || s[i]=='V' || s[i]=='8'){
					f[j]='8';
					j++;
				}
				else if(s[i]=='W' || s[i]=='X' || s[i]=='Y' || s[i]=='9'){
					f[j]='9';
					j++;
				}
				else if(s[i]=='1'){
					f[j]='1';
					j++;
				}
				else if(s[i]=='0'){
					f[j]='0';
					j++;
				}
			}
			total.push_back(f);
			if(it==0) def.push_back(f);
			else{
				bool rep = false;
				for(int i=0; i<def.size(); i++){
					if(f==def.at(i)){
						rep = true;
						break;
					}
				}
				if(rep==false) def.push_back(f);
			}
		}
		sort(def.begin(), def.end());
		int cont[def.size()];
		for(int i=0; i<def.size();i++){
			cont[i]=0;
		}
		for(int i=0; i<total.size(); i++){
			for(int j=0; j<def.size(); j++){
				if(total.at(i)==def.at(j)) cont[j]++;
			}
		}
		for(int i=0; i<def.size(); i++){
			if(cont[i]!=1) cout<<def.at(i)<<" "<<cont[i]<<endl;
		}
	}
}
