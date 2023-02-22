#include <bits/stdc++.h>

using namespace std;

int main(int argc, char *argv[]) {
 	
	double a,b,c,aux,sm,rad;
	
	while(cin>>a>>b>>c){
		
		sm = (a+b+c)/2;
		double au= sm-a,bu=sm-b,cu=sm-c;
		aux = sm*((au)*(bu)*(cu));		
		sm == 0 ? rad =0.000f : rad = sqrt(aux)/sm;	
		//if(sm==0){rad =0.0f;}else{rad = sqrt(aux)/sm;
		printf("The radius of the round table is: %0.3f",rad);
		cout<<endl;
	}
	return 0;
}

