#include<bits/stdc++.h>
using namespace std;

int mod(int a, int b) {
    return ((a%b)+b)%b;
}

int main() {
    int val,start = 50,cont=0,temp;
    char dir;
    while (cin>>dir>>val) {
        if (dir=='R') {
            temp=start+val;
            start = mod(temp,100);
        }
        else if (dir=='L') {
            temp=start-val;
            start = mod(temp,100);
        }
        if (temp>=100 || temp<=0) cont++;
    }
    cout<<cont<<endl;
}