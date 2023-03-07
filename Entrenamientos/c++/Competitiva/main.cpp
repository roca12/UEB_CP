#include<iostream>
using namespace std;

int a[11][11]; 
int b[11][11];

void sumaMar(int fil,int col){
	for (int i=0;i<fil;i++){
		for (int j=0;j<col;j++){
			int aux= (a[i][j]+b[i][j]);
			cout<<aux;
			if (j<col-1){
				cout<<" ";
			}
		}
		cout<<"\n";
	}
}
	
void restaMar(int fil,int col){
	for (int i=0;i<fil;i++){
		for (int j=0;j<col;j++){
			int aux= (a[i][j]-b[i][j]);
			cout<<aux;
			if (j<col-1){
				cout<<" ";
			}
		}
		cout<<"\n";
	}
}
	
void transpuesta(int fil,  int col){
	for (int j=0;j<col;j++){
		for (int i=0;i<fil;i++){
			cout<<a[i][j];
			if (i<col-1){
				cout<<" ";
			}
		}
		cout<<"\n";
	}
}
		
	
int main (int argc, char *argv[]) {
	int ax,ay,bx,by;
	cin>>ax>>ay;
	for (int i=0;i<ax;i++){
		for (int j=0;j<ay;j++){
			cin>>a[i][j];
		}
	}
	
	cin>>bx>>by;
	for (int i=0;i<bx;i++){
		for (int j=0;j<by;j++){
			cin>>b[i][j];
		}
	}
	
	sumaMar(ax,ay);
	restaMar(ax,ay);
	transpuesta(ax,ay);
	return 0;
}
		
		
		
