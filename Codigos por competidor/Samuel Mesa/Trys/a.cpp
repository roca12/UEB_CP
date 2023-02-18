#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	
	int cases,size,ordenes,dato;
	string orden;
	cin>>cases;
	list<int> datos;
	
	for(int i = 1;i <= cases;i++){
		
		cout<<"Case "<<i<<":"<<endl;
		cin>>size>>ordenes;
		
		for(int j = 0 ; j < ordenes ; j++){
			
			cin>>orden;
			
//			if((orden == "pushLeft") && (datos.size() < size)){
//				
//				cin>>dato;
//				datos.push_front(dato);
//				cout<<"Pushed in left: "<<dato<<endl;
//				
//			}else if((orden == "pushRigth") && (datos.size() < size)){
//				
//				cin>>dato;
//				datos.push_back(dato);
//				cout<<"Pushed in rigth: "<<dato<<endl;
//				
//			}else if((orden.find("push")!= string::npos)&&(datos.size() == size)){
//				
//				cin>>dato;
//				cout<<"The queue is full"<<endl;
//				
//			}else if ((orden =="popLeft") && !(datos.empty())){
//				
//				cout<<"Popped from left: "<<datos.front()<<endl;;
//				
//			}else if ((orden =="popRigth") && !(datos.empty())){
//				
//				cout<<"Popped from rigth: "<<datos.back()<<endl;;
//				
//			}else if((orden.find("pop")!= string::npos) && datos.empty()){
//				
//				cout<<"The queue is empty"<<endl;
//			}
			datos.clear();
		}
		
	}	
	
	return 0;
}

