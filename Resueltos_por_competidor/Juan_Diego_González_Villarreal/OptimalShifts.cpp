#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        string s;
        cin>>n>>s;
        int lZ = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == '0') lZ++;
            else break;
        }
        for (int i = n-1; i >= 0; i--) {
            if (s[i] == '0') lZ++;
            else break;
        }

        int m = 0,count=0;
        for (int i = 0; i<n; i++) {
            if (s[i]=='1') {
                m = max(m,count);
                count = 0;
            }else {
                count++;
            }
        }
        cout<<max(m,lZ)<<endl;
    }
}
