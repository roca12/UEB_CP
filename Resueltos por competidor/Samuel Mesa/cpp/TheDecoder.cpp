#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	
	string a,out;
	char aux2;

	
while(cin>>a){
	int length = a.length();
	char* array = new char[length+1];
	strcpy(array, a.c_str());
	
	
	for(int i =0;i<length ;i++){
		
	int aux = (int) array[i]-7;
		aux2 = (char) aux;
		out += aux2;
		
	}
	
	cout<<out<<endl;
	out ="";
}
	return 0;
}

