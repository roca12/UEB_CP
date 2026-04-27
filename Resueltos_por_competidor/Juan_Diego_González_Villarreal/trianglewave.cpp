#include <bits/stdc++.h>
using namespace std;

string generateWave(int a) {
    string ans = "";
    for (int i=1;i<=a;i++) {
        for (int j=1;j<=i;j++) {
            ans+=to_string(i);
        }
        if (i<a)ans+="\n";

    }
    for (int i=a-1;i>=1;i--) {
        ans+="\n";
        for (int j=i;j>=1;j--) {
            ans+=to_string(i);
        }
    }
    return ans;
}

int main() {
    int t;
    cin>>t;
    while (t-->0) {
        int a,f;
        cin>>a>>f;
        string wave = generateWave(a);
        for (int i=0;i<f;i++) {
            if (i<f-1)cout<<wave<<endl<<endl;
            else cout<<wave;
        }
        if (t>0)cout<<endl<<endl;
        else cout<<endl;
    }
}