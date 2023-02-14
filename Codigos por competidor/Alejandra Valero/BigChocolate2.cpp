#include <iostream>

using namespace std;

main() {
	int filas;
	int columnas;
	int cortes;
	while(cin>>filas&&cin>>columnas){

		  cortes = (filas*columnas)-1;
		  cout<<cortes<<endl;
	}
}
