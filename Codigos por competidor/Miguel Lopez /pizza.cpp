#include <bits/stdc++.h>
using namespace std;
   int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t, op = 0, s = 0, m = 0, l = 0; cin >> t;
    for (int i = 0; i < t; i++) {
        char tipo;
        int r;
        cin >> tipo >> r;
        if (tipo == 'S'){
            s += r;
        }
        else if (tipo == 'M'){
            m += r;
        }
        else if (tipo == 'L'){
            l+=r;
        }
    }

        if (s > 0) {
            op += ceil(s / 6.0);
        }
        if (m > 0){
            op += ceil(m / 8.0);
        }
        if (l > 0) {
            op += ceil(l / 12.0);
        }
    cout << op << endl;



}
