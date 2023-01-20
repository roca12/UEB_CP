#include<bits/stdc++.h>

#define Dpos(n) fixed << setprecision(n)

using namespace std;

int main(){
	int t;
	cin>>t;
	
	for(int caso=1; caso<=t; caso++){
		double ab, ac, bc, radio;
		
		cin>>ab>>ac>>bc>>radio;
		
		double x = radio / (radio+1);
		
		cout<<"Case "<<caso<<": "<< Dpos(6) <<ab*sqrt(x)<<endl;
	}
}
