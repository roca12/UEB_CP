#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    while(true){
        cin>>n;
        int pole[n], mov[n], final[n];
        for(int i=0; i<n; i++) final[i]=0;
        int mayor = 0;
        bool bien = true;
        if(n==0) break;
        for(int i=0; i<n; i++){
            cin>>pole[i]>>mov[i];
            if(pole[i]>mayor) mayor = pole[i];
        }
        for(int i=0; i<n; i++){
            final[i+mov[i]] = pole[i];
            if(mov[i]>mayor){
                bien = false;
                break;
            }
        }
        if(bien){
            for(int i=0; i<n; i++){
                if(final[i]!=0){
                    for(int j=1; j<n-1; j++){
                        if(i!=j){
                            if(final[i]==final[j]){
                                bien = false;
                                break;
                            }
                        }
                    }
                }
                else{
                    bien = false;
                    break;
                }
            }
        }
        
        if(bien){
            for(int i=0; i<n; i++) cout<<final[i]<<" ";
            cout<<endl;
        }
        else{
            cout<<"-1"<<endl;
        }
    }
}