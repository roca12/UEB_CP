#include <bits/stdc++.h>

using namespace std;

int main() {
    int tt;
    cin>>tt;
    while(tt--) {
        int l,a,b;
        cin>>l>>a>>b;
        vector<bool> visited(l ,false);
        int n = 0, val = (a + n*b)%l, max = val;
        while (!visited[val]) {
            visited[val] = true;
            n++;
            val = (a + n*b)%l;
            if (val>max) max = val;
        }
        cout<<max<<endl;
    }
}
