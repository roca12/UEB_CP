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


int main() {
    int t;
    cin>>t;
    while (t--) {
        ll a,b;
        cin>>a>>b;
        ll temp=gcd(a,b);
        cout<<(a*b)/temp<<" "<<gcd(a,b)<<endl;
    }
}
