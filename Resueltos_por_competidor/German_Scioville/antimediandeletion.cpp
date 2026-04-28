/*
 * Autor: Scioville
 * Problema: Antimedian Deletion (https://codeforces.com/contest/2211/problem/A)
 * Juez online: Codeforce
 * Veredicto: accepted  
 * You kind of left her hanging this morning
 * */
#include <bits/stdc++.h>
using namespace std;
 
int main() {
    int t,n,aux;
    cin>>t;
    while(t>0){
            cin>>n;
            int permuta[n];
            for(int i = 0; i<n;i++){
            cin>>aux;
            permuta[i]=aux;
        }
        if(n>=3){
        for(int i = 0; i<n;i++){
            cout<<2<<" ";
        }
        cout<<endl;
        }else{
        for(int i = 0; i<n;i++){
            cout<<n<<" ";
        }
        cout<<endl;
        }
 
        t--;
    }
}