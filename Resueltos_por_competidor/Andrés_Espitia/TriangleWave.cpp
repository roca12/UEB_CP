#include<iostream>

using namespace std;

int main(){
    int t, a, f, i, j, t1, k = 0;
    cin>>t;
    for(t1=1;t1<=t;t1++){
        cin>>a>>f;
        for(i=1;i<=f;i++){
            for(j=1;j<a;j++){
                for(k=1;k<=j;k++) cout<<j;
                cout<<endl;
            }
            for(j=a;j>=1;j--){
                for(k=1;k<=j;k++) cout<<j;
                cout<<endl;
            }
            if((t==t1)&&(i==f)) break;
            cout<<endl;
            }
    }
}
