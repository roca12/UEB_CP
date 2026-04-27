#include<bits/stdc++.h>
using namespace std;

int main() {
    int n,x,r,d, wind;
    cin>>n>>x>>r>>d;
    int total = 0;
    for (int i=0;i<n;i++) {
        cin>>wind;
        if (!wind) total += x;
        if (i%d==0 && i!=0) total += r;
    }
    cout<<total<<endl;
}