#include <iostream>
#include <sstream>
#include <string>
using namespace std;
main(){
int result=0;
int arreglo[5];
int tea;
while(cin>>tea&&cin>>arreglo[0]&&cin>>arreglo[1]&&cin>>arreglo[2]&&cin>>arreglo[3]&&cin>>arreglo[4]){
	for (int i = 0; i < 5; i++) {
		if (arreglo[i] == tea) {
			result++;
		}
	}
	cout<<result<<"\n";
	result = 0;
    }
}	
