#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    int count = 0;
    while(t--) {
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            int val;
            cin>>val;
            if (val == 1) temp++;
        }
        count+=(temp/2);
    }
    cout<<count<<endl;
}