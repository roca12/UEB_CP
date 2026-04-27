#include <bits/stdc++.h>

using namespace std;

int main(int argc, char *argv[]) {
	string taux;
	getline(cin,taux);
	int t = stoi(taux);
	while(t--){
		string naux;
		getline(cin, naux);
		int n = stoi(naux);
		int c=0;
		vector<int> mov;
		while(n--){
			string aux;
			getline(cin,aux);
			if(aux=="LEFT") mov.push_back(-1);
			else if(aux=="RIGHT") mov.push_back(1);
			else{
				mov.push_back(mov[aux[8]-'0'-1]);
			}
		}
		for(int i=0; i<stoi(naux); i++){
			c += mov[i];
		}
		cout<<c<<endl;
	}
	return 0;
}
