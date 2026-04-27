#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        vector<int> v(n);
        for (int i = 0; i < n; i++) cin>>v[i];
        int max = v[0], count=0;
        for (int i = 1; i < n; i++) {
            if (v[i]<max) {
                count++;
            }else if (v[i]>max) {
                max = v[i];
            }
        }
        cout<<count<<endl;
    }
}