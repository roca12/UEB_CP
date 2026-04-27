#include "iostream"
#include "string"

using namespace std;
main(){
string palabra;
int a;
cin>>a;
string palabras[a];
string pal;

for(int i = 0; i < a; i = i+1){
	cin>>palabra;
	palabras[i]=palabra;
}

for(int i = 0; i < a; i = i+1){
 cout<<"Hello "<<palabras[i]<<"!\n";   
}
}
