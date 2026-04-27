#include <bits/stdc++.h>

using namespace std;

int main(){
    int n = 0;
    while(true){
        cin>>n;
        if(n==0) break;

        int deck[n], org[n];

        for(int i=0; i<n; i++){
            cin>>deck[i];
            org[i] = deck[i];
        }

        


        int cont = 0;
        while(true){
            if(org == deck) break;

            for(int i=0; i<n; i++){
                deck[deck[i]] = i+1; 
            }
			
			for(int i=0; i<n; i++){
				cout<<deck[i];
			}
			cout<<endl;
            cont++;
        }
        cout<<cont<<endl;
    }
    return 0;
}
