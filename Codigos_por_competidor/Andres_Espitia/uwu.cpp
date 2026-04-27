#include <bits/stdc++.h>

using namespace std;

int main()
{
    int i, j;
    while(cin>>i && cin>>j){
        cout<<i<<" "<<j<<" ";
        if(j<i){
            int a = j;
            j = i;
            i = a;
        }
        int mayor = 0;
        for(int n=i+1; n<j; n++){
            int aux = n, cont=1;
            while(aux>1){
                if(aux%2!=0){
                    aux=(3*aux)+1;
                }
                else{
                    aux=aux/2;
                }
                cont++;
            }
            if(cont>mayor) mayor=cont;
        }
        cout<<mayor<<endl;
    }
}