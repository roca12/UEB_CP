#include<bits/stdc++.h>
using namespace std;
int max = 10000;

int mod(int a, int b) {
    return ((a%b)+b)%b;
}


int main() {
    int t;
    cin>>t;
    while (t--) {
        int n, q, a, aCont = 0, bCont= 0, secs ;
        cin>>n>>q;
        vector<char> machines(n);
        for (int i = 0; i < n; i++) {
            cin>>machines[i];
            if (machines[i]=='A') aCont++;
            if (machines[i]=='B') bCont++;
        }
        for (int i = 0; i < q; i++) {
            cin>>a;
            if (bCont == 0) {
                cout<<a<<endl;
            }else {
                secs = 0;
                int m = 0;
                while (a>0) {
                    if (machines[m] == 'A') {
                        a--;
                    }else {
                        a/=2;
                    }
                    secs++;
                    m = mod(m+1, n);
                }
                cout<<secs<<endl;
            }

        }

    }
}
