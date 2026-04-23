#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;
        vector<int> v(n);
        for(int i=0;i<n;i++) {
            cin>>v[i];
        }
        int prev = v[0];
        for (int i=1;i<n;i++) {
            if (v[i]<=prev) {
                prev = v[i]*(prev/v[i] +1);
            }else {
                prev=v[i];
            }
        }
        cout<<prev<<endl;
    }
}
