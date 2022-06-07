/*****************************************
 A Multiplication Game
 ***ID: 847
 ***Juez: UVA
 ***Tipo: Number Theory
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

int main(){
   int n;
   while(cin>>n){
       bool stan=true;
       int p=1,last=1;
       while(1){
           if(stan){p*=9;last=1;stan=false;}
           else {p*=2;stan=true;last=2;}
           if(n<=p)break;
       }
       if(last==1)cout<<"Stan wins."<<endl;
       else cout<<"Ollie wins."<<endl;
   }
}
