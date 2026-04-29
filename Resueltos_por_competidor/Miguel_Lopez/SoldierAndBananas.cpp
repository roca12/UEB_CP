#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    typedef long long int ll;
    int n, k, w, total = 0, debe; cin >> n >> k >> w;
    for(int i = 1 ; i <= w ; i++) {
        int op = i * n;
    //    cout << op << endl;
        total +=op;
    }
    if(total <= k) {
        cout << 0 << endl;
    }
    else {
        debe = total - k;
        cout << debe << endl;
    }

}
// link: https://codeforces.com/contest/546/problem/A
