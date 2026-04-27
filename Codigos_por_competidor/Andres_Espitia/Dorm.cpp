#include<bits/stdc++.h>

using namespace std;

float area(int x[], int y[], int n){
	float suma = x[0]*y[n-1] - x[n-1]*y[0];
	
	for(int i=0; i<n-1; i++){
		suma += x[i+1]*y[i] - x[i]*y[i+1];
	}
	
	return suma/2;
}

int main(){
	int t;
	cin>>t;
	int x[t];
	int y[t];
	for(int i=0; i<t; i++) cin>>x[i]>>y[i];
	
	float x1 = x[2];
	float x2 = x[3];
	
	float y1 = y[2];
	float y2 = y[3];
	
	float x_med = (x1 + x2)/2;
	float y_med = (y1 + y2)/2;
	float a = area(x,y,t+1);
	float b = area(x,y,t);
	
	float delta = a/2 - b;
	float control = 1;
	float x_old = x1;
	float y_old = y1;
	while(control > 1e-6){
		if(delta<0){
			float x_old = x2;
			float y_old = y2;
			
			x2 = x_med;
			y2 = y_med;
			
		}else if(delta>0){
			x1 = x_med;
			y1 = y_med;
			x2 = x_old;
			y2 = y_old;
		}
		control = abs(delta);
	}
	cout<<x1<<" "<<x2<<endl;
}
