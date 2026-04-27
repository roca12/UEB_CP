#include<bits/stdc++.h>
typedef long long ll;
using namespace std;

ll gcd(ll a, ll b) {
    if (a == 0)
        return b;
    if (b == 0)
        return a;
    if (a == b)
        return a;
    if (a > b)
        return gcd(a - b, b);

    return gcd(a, b - a);
}

ll lcm(ll a, ll b){
    return (a*b)/gcd(a,b);
}

int main() {
    int n;
    cin>>n;
    ll temp,a;
    cin>>temp;
    for (int i=1;i<n;i++) {
        cin>>a;
        temp = gcd(temp, a);
    }
    a=0;
    for (int i=1; i<=temp; i++) {
        if (temp%i==0) {
            a++;
            temp=temp/i;
        }
    }
    cout<<a<<endl;
}