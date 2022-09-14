#include <bits/stdc++.h>using namespace std;int main(){	stack<int> pila;
	for (int i = 0; i <10; i++) {
		int siguiente= rand()%400;
		cout<<siguiente<<endl;
		pila.push(siguiente);			
	}
	cout<<pila.top()<<endl;
	cout<<"-------------\n";
	while (!pila.empty()) {
		int actual= pila.top();
		pila.pop();
		cout<<actual<<endl;
	}}
