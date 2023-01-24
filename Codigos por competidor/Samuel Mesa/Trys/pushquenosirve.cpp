#include <bits/stdc++.h>
using namespace std;

int main() {
	
	int t ;
	cin>>t;
	
	for(int i = 0;i<t;i++){
		
		cout<<"Case "<<i+1<<":"<<endl;
		list<int> lista;
		int n,m;
		cin>>n;
		cin>>m;
		
		for(int j = 0;j<m;j++){
			
			string orden;
			cin>>orden;
			
			if((orden =="pushLeft") && (lista.size() < n)){

				int dato;
				cin>>dato;
				lista.push_front(dato);
				cout<<"Pushed in left: "<<dato<<endl;
				
			}else if((orden =="pushRigth")&& lista.size() < n){
				
			int dato;
			cin>>dato;
			lista.push_back(dato);
			cout<<"Pushed in rigth: "<<dato<<endl;
			
			}else if((orden =="pushLeft" || orden=="pushRigth") && (lista.size() == n)){
				
				int aux;
				cin>>aux;
				cout<<"The queue is full"<<endl;
				
			}else if(orden=="popLeft" && lista.size() > 0){
				
				cout<<"Popped from left: "<<lista.front()<<endl;
				lista.pop_front();
				
			}else if((orden=="popRigth") && (lista.size() > 0)){
		
				cout<<"Popped from rigth: "<<lista.back()<<endl;
				lista.pop_back();
				
			}else if((orden == "popLeft" || orden== "popRigth" ) 
				&& (lista.size() == 0)){
				
				cout<<"The queue is empty"<<endl;
				
			}
		}
	}
	return 0;
}

