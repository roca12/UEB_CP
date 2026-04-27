#include <bits/stdc++.h>
using namespace std;
int main(){
    int N;
    cin>>N;
    int cont = 0;
    int res = 0;
    for(int i=1; i<=N; i++){
        res += i+cont;
        if(cont != i){
            cont++;
            i--;
        }else{
            cont = 0;
        }
    }
    cout<<res<<endl;
}