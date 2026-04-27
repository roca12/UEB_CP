#include<bits/stdc++.h>

using namespace std;
int main() {
    int t;
    cin>>t;

    for (int cases = 1; cases <= t; cases++) {
        int n;
        cin>>n;
        int a[n];
        for (int i = 0; i < n; i++) {
            cin>>a[i];
        }
        int k = a[0];
        for (int i = 0; i < n-1; i++) {
            if (a[i+1]-a[i] > k) k = a[i+1]-a[i];
        }
        int prev  = 0;
        int temp = k;
        bool flag = true;
        for (int i = 0; i < n; i++) {
            int diff = a[i]-prev;
            if (diff == temp)temp--;
            else if (diff>temp) flag = false;
            prev = a[i];
        }
        if (!flag)k++;
        cout<<"Case "<<cases<<": "<<k<<endl;
    }
}
