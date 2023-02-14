#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin>>t;
	int caso = 1;
	while(t--){
		double radio;
		cin>>radio;
		
		double pi = 2 * acos(0);
		double areac = pi * radio * radio;
		double areacu = (radio * 2) * (radio * 2);
		
		double areas = (areacu - areac) + pow(10, -9);
		
		cout<<"Case "<<caso<<": ";
		printf("%.2f", areas);
		cout<<endl;
		caso++;
	}		
}
