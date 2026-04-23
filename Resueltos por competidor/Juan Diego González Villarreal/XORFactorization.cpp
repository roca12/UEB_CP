#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
    int tt;
    cin>>tt;
    while(tt--) {
        ll n,k;
        cin>>n>>k;
        if (k%2 == 0) {
            cout<<0<<" ";
            for (int i = 1; i < k; i++) {
                cout<<n<<" ";
            }
            cout<<endl;
        }else {
            for (int i = 0; i < k; i++) {
                cout<<n<<" ";
            }
            cout<<endl;
        }
    }
}

