#include<bits/stdc++.h>

using namespace std;

int main(){
	int numeros[] = {0,0,64,32,16,8,0,4,2,1,0};
	string leer;
	int aux;
	char imprimir;
	while(cin>>leer){
		aux = 0;
		
		if(leer[0]!='|'){
			continue;
		}
		
		for(int i=2; i<=9; i++){
			if(leer[i]=='o'){
				aux += numeros[i];
			}
		}
		imprimir = aux;
		cout<<imprimir;
	}
	
	return 0;
}
