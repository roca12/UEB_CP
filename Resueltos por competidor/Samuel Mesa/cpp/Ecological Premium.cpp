#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	
	int casos;
	cin>>casos;
	for(int i =0;i<casos;i++){
		
		int granjeros,prima=0;
		cin>>granjeros;
		
		for(int j =0;j<granjeros;j++){
			
			int tama,animales,grado,aux;
			
			cin>>tama>>animales>>grado;
			
			//aux =((tama/animales)*grado)*animales;
			aux = tama*grado;
			prima= prima +aux;
		}
		cout<<prima<<endl;
	}
	
	
	return 0;
}

