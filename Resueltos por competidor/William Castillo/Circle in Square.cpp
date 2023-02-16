#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	int t;
	double pi = 2 * acos(0);
	cin>>t;
	
	for(int i = 0; i<t; i++){
		double radio;
		cin>>radio;
		cout<<"Case "<<i+1<<": ";
		double circulo = (pow(radio,2))*pi;
		double cuadrado = pow((radio*2),2);
		printf("%.2f", (cuadrado-circulo)+pow(10,-9));
		cout<<endl;
	}
	
	return 0;
}

