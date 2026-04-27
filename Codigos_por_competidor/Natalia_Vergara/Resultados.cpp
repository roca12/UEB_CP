#include "iostream"
#include "string"

using namespace std;
main(){
int a, num1,num2,num3,num4;
cin>>a;
int resultados[a];

for(int i = 0; i < (a); i = i+1){
	cin>>num1;
	cin>>num2;
	cin>>num3;
	cin>>num4;
	resultados[i]=num1+num2+num3+num4;
}

for(int i = 0; i < a; i = i+1){
 cout<<resultados[i]<<"\n";   
}
}
