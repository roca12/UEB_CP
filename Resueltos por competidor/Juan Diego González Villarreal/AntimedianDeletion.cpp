#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        vector<int> v(n);
        for (int i = 0; i < n; i++)cin>>v[i];
        if (n<3) {
            for (int i = 0; i < n; i++) {
                cout<<n<<" ";
            }
        }else {
            for (int i = 0; i < n; i++) {
                cout<<2<<" ";
            }
        }
        cout<<endl;
    }
}
