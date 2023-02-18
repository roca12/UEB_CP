#include <bits/stdc++.h>
using namespace std;

int main() {
	
	int h,u,d,f,dia;
	float sube,pos;
	bool win;
	
	
	while(cin>>h && h!=0){
		cin>>u>>d>>f;
		
		win = true;
		
		dia = 1;
		pos = 0;
		
		sube = u;
		float fati = (f * sube) / 100;
		
		while (true) {
			
			if (fati > 0) {pos += sube;}
			if (pos > h) {break;}
			pos -= d;
			sube = sube - fati;
			if (pos < 0) {win = false;break;}
			
			dia++;
		}
		win ? cout<<"success on day "<<dia<<endl : cout<<"failure on day "<<dia<<endl;
	}
	return 0;
}
