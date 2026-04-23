#include<bits/stdc++.h>
typedef long long ll;
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        long long n, c, k;
        cin>>n>>c>>k;
        vector<ll> a(n);
        for(auto &x:a) cin>>x;
        sort(a.begin(),a.end());
        bool flag = false;
        for(int i = 0; i < n; i++){
            if(!flag && a[i] <= c){
                c += k;
                flag = true;
            }
            if(a[i] <= c){
                c += a[i];
            }
        }
        cout << c << "\n";
    }
}