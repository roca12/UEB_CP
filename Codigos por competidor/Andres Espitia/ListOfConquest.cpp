#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	int t=0;
	cin>>t;
	vector<string> noms;
	for(int i=0; i<t; i++){
		string nombre;
		char aux[75];
		cin>>nombre;
		cin.getline(aux,75);
		noms.push_back(nombre);
	}
	sort(noms.begin(), noms.end());
	int contaux = 1;
	for(int i=1; i<=t; i++){
		if(noms[i]==noms[i-1]){
			contaux++;
		}else if(noms[i]!=noms[i-1]){
			cout<<noms[i-1]<<" "<<contaux<<endl;
			contaux=1;
		}else{
			cout<<noms[i]<<" "<<contaux<<endl;
			contaux = 1;
		}
	}
	return 0;
}
