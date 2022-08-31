#include<bits/stdc++.h>
using namespace std;

int main(){
	vector<vector<string>> listas (10, vector<string>(10, "a"));
	for (int i = 0; i < 10; i++) {
		//lista.push_back(rand()%100);
		lista.emplace_back(rand()%100);
	}
	
	for (int i = 0; i < lista.size(); i++) {
		cout<<lista.at(i)<<endl;
	}
	
	
	
}
