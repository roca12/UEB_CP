#include <bits/stdc++.h>
using namespace std;

int main() {
	
	int h,u,d,f,dia;
	float sube,pos;
	bool win;
	
	while(cin>>h>>u>>d>>f && h>0){
		
		dia =1;
		pos=0;
		sube = (float)u;
		float fati = (f * sube) / 100; //no c sumar xd
		win = true;
		
			while(true){
			
			if(sube > 0){pos =pos + sube;}
			if (pos > h) {break;}
			pos = pos - d;
			sube = sube - fati;
			if(pos<0){win = false; break;}
			dia++;
			
		}
		win ? cout<<"success on day "<<dia<<endl : cout<<"failure on day "<<dia<<endl;
	}
	return 0;
}

