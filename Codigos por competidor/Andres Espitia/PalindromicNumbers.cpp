#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	int t;
	string s;
	int caso = 1;
	cin>>t;
	while(t--){
		cin>>s;
		cout<<"Case "<<caso<<": ";
		bool pal = true;
		for(int i=0; i<s.size(); i++){
			if(s[i]!=s[s.size()-1-i]){
				pal = false;
				break;
			}
		}
		if(pal) cout<<"Yes";
		else if(!pal) cout<<"No";
		cout<<endl;
		caso++;
	}
	return 0;
}

