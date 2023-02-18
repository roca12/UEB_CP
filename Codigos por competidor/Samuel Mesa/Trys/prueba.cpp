#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	int t ;
	cin>>t;
	for(int i = 0;i<t;i++){
		list<int> lista;
		int n,m;
		cin>>n;
		cin>>m;
		cout<<"Case "<<i+1<<":"<<endl;
		for(int j = 0;j<m;j++){
			string orden;
			cin>>orden;
			if(!(orden.find("pushLeft")) && (lista.size() < n)){
				
				int dato;
				cin>>dato;
				lista.emplace_back(dato);
				cout<<"Pushed in left: "<<dato<<endl;
				
			}else if(!(orden.find("pushRigth"))&& lista.size() < n){
				
			int dato;
			cin>>dato;
			lista.emplace(lista.begin(),dato);
			cout<<"Pushed in rigth: "<<dato<<endl;
			
			}else if(!(orden.find("push")) && (lista.size() == n)){
				int aux;
				cin>>aux;
				cout<<"The queue is full"<<endl;
			}else if(!(orden.find("popLeft")) && lista.size() > 0){
				
				cout<<"Popped from left: "<<lista.front()<<endl;
				lista.pop_front();
				
			}else if(!(orden.find("popRigth")) && (lista.size() > 0)){
		
				cout<<"Popped from rigth: "<<lista.back()<<endl;
				lista.pop_back();
			}
//			else if(!(orden.find("pop")) && (lista.empty())){
//				
//				cout<<"The queue is empty"<<endl;
//			}
		}
	}
	return 0;
}

