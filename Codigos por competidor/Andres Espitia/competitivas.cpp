#include <bits/stdc++.h>
using namespace std;
int main() {
    int t, n, total, puntos, problem;
    
    cin>>t;
    while(t--){
    	total = 0;
    	int p[8]={0,0,0,0,0,0,0,0};
        cin>>n;
        while(n--){
        	cin>>problem>>puntos;
        	if(problem<9){
        		if(puntos>p[problem-1]){
        			p[problem-1]=puntos;
				}
			}
		}
		for(int i=0; i<9; i++){
			total=total+p[i];
		}
		cout<<total<<endl;
    }
}

