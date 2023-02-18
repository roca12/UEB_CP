#include <bits/stdc++.h>

using namespace std;

int main(int argc, char *argv[]) {
 	
	double a,b,c;
	double p,aux,s,are,r;
	
	while(cin>>a>>b>>c){

		p = a+b+c;
		
		s = p/2;
		
		aux = s*(s-a)*(s-a)*(s-c);
		
		are = sqrt(aux);
		
		r = are/s;
		
		cout<<"The radius of the round table is: ";
		// hpta vida
		printf("%.3f",r);
		cout<<endl;
		
		
	}
	return 0;
}

