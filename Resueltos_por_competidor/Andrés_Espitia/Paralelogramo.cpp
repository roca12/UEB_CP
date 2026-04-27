#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin>>t;
	for(int caso=1; caso<=t; caso++){
		int ax, ay;
		int bx, by;
		int cx, cy;
		int dx, dy;
		
		cin>>ax>>ay>>bx>>by>>cx>>cy;
		
		dx = ax + cx - bx;
		dy = ay + cy - by;
		
		float area = 0.5* (((ax * by) + (bx * cy) + (cx * dy) + (dx * ay)) - ((ay * bx) + (by * cx) + (cy * dx) + (dy * ax)));
		
		if(area < 0) area *= -1;
		
		cout<<"Case "<<caso<<": "<<dx<<" "<<dy<<" "<<area<<endl;
	}
	
}
