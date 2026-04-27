#include <bits/stdc++.h>

using namespace std;

int main() {
    int tt;
    cin>>tt;
    while(tt--) {
        int n;
        cin>>n;
        vector<string> v(n);
        for(int i=0;i<n;i++) cin>>v[i];
        string temp;
        for(int i=0;i<n;i++) {
            if (temp.empty()) temp = v[i];
            else if ((v[i]+temp)<(temp+v[i])) temp=v[i]+temp;
            else temp+=v[i];
        }

        cout<<temp<<endl;
    }
}
