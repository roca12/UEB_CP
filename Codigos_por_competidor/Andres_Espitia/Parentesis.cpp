#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin>>t;
	while(t--){
		string par;
		cin>>par;
		int x=0, y=0;
		bool cont = true;
		
		for(int i=0; i<par.length(); i++){
			if (par.length() < 2 || par.length()%2 != 0) {
				cont = false;
				break;
			}
			if (par[i] == '(' && x >= 0 && i+1 < par.length() && par[i+1] != ']') {
				x++;
			} else if (par[i] == ')' && x > 0) {
				x--;
			} else if (par[i] == '[' && y >= 0 && i+1 < par.length() && par[i+1] != ')') {
				y++;
			} else if (par[i] == ']' && y > 0) {
				y--;
			} else {
				cont = false;
				break;
			}
		}
		
		if(cont && !x && !y) cout<<"Yes"<<endl;
		else cout<<"No"<<endl;
	}
}
