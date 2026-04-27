#include<bits/stdc++.h>

using namespace std;

int main(){
	int n, m;
	cin>>n>>m;
	int escuelas[m];
	int admitidos[m];
	for(int i=0; i<m; i++) cin>>escuelas[i];
	for(int i=0; i<m; i++) admitidos[i]=0;
	
	int necesarios = 0;
	for(int i=0; i<m; i++) necesarios += escuelas[i];
	
	if(n<necesarios){
		int pos=0;
		while(n>0){
			if(escuelas[pos]>admitidos[pos]){
				admitidos[pos]++;	
			}else{
				n++;
			}
			if(pos==m-1) pos=0;
			else pos++;
			n--;
		}
	}else{
		for(int i=0; i<m; i++) admitidos[i]=escuelas[i];
	}
	
	for(int i=0; i<m; i++) cout<<admitidos[i]<<endl;
}
