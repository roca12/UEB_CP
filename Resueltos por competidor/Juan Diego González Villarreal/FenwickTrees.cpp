#include<bits/stdc++.h>
typedef long long ll;
using namespace std;

struct FenwickTree {
     ll n ;
     vector < ll > bit ;
     FenwickTree (ll n ) : n ( n ) , bit ( n + 1 , 0) {}
     void add (ll i , ll delta ) {
         for (; i <= n ; i += i & -i ) {
             bit [ i ] += delta ;
             }
         }
     ll query ( ll i ) {
         ll sum = 0;
         for (; i > 0; i -= i & -i ) {
             sum += bit [ i ];
             }
         return sum ;
         }
     ll queryRange (ll l , ll r ) {
         return query (r ) - query ( l - 1) ;
         }
};
int main() {
    ll n,q,temp;
    cin>>n;
    FenwickTree ft(n);
    for (ll i = 1; i<=n;i++) {
        cin>>temp;
        ft.add(i, temp);
    }
    char op;
    ll n1,n2;
    cin>>q;
    for (int i = 0; i<q;i++) {
        cin>>op>>n1>>n2;
        if (op=='q') {
            cout<<ft.queryRange(n1,n2)<<endl;
        }else {
            ft.add(n1, n2);
        }
    }
}
