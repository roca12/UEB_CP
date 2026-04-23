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
        vector<int> temp = v;
        sort(temp.begin(), temp.end(), greater<int>());
        for(int i=0;i<n;i++) {
            if (v[i] == temp[0]) {
                cout<<v[i]-temp[1]<<" ";
            }else {
                cout<<v[i]-temp[0]<<" ";
            }
        }
        cout<<endl;
    }
}
