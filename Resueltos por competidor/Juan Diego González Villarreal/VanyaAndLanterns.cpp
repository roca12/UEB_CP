#include <bits/stdc++.h>
typedef long long ll;
typedef long double ld;
using namespace std;


int main() {
    int n;
    ld l;
    cin >> n >> l;
    vector<ld> v(n);
    for(int i = 0; i < n; i++) {
        cin >> v[i];
    }
    sort(v.begin(), v.end());
    ld maxDiff = v[0];
    ld prev = v[0];
    for (int i = 1; i < n; i++) {
        if((v[i]-prev)/2>maxDiff) {
            maxDiff = (v[i]-prev)/2;
        }
        prev = v[i];
    }
    if (l-v.back()>maxDiff) maxDiff =l- v.back();
    printf("%.10Lf \n", maxDiff);
}
