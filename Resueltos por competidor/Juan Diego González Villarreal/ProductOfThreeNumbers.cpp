#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
    int tt;
    cin >> tt;
    while (tt--) {
        ll n;
        cin>>n;
        vector<bool> v(3,false);
        ll a ,b ,c;
        for (ll i = 2; i*i < n; i++) {
            if (n%i==0) {
                a = i;
                v[0] = true;
                break;
            }
        }
        if (v[0]) {
            for (ll i = 2; i*i < n/a; i++) {
                if ((n/a)%i==0 && i!=a) {
                    b = i;
                    v[1] =  true;
                    break;
                }
            }
        }else {
            cout<<"NO"<<endl;
            continue;
        }

        if (v[0] && v[1]) {
            c = n/(a*b);
            if (c!=a && c!=b && c!= 1) {
                cout<<"YES"<<endl;
                cout<<a<<" "<<b<<" "<<c<<endl;
            }else cout<<"NO"<<endl;
        }else cout<<"NO"<<endl;


    }

}