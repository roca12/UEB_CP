#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;
        ll a[n];
        for(int i=0;i<n;i++) {
            cin>>a[i];
        }

        for (int i = 0; i<n;i++) {
            ll left = 0,  right = 0;
            for (int j = i+1; j<n; j++) {
                if (a[j]<a[i]) left++;
                if (a[j]>a[i]) right++;
            }
            cout<<max(left,right)<<" ";
        }
        cout<<endl;
    }
}
