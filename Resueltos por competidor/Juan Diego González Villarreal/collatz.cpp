#include <bits/stdc++.h>

using namespace std;


int main(){
    long long A,L;
    int cont = 0;
    while(cin>>A>>L){
        if(A <0 && L <0) break;
        cont++;
        long long temp = A;
        int terms = 1;
        while(temp!=1){
            if(temp%2==0){
                temp = temp/2;
            }else{
                temp = 3*temp + 1;
            }
            if(temp<=L)terms++;
            else break;
        }
        cout<<"Case "<<cont<<": A = "<<A<<", limit = "<<L<<", number of terms = "<<terms<<endl;
    }
}