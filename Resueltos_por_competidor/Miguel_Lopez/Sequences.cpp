#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int GCD(int a, int b) {
    if(b == 0){
        return a;
    } else {
        return GCD(b, a % b);
    }
}
    int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll n; cin >> n;
    ll i = 1;

    while(i*(i+1)/2 < n){
        i++;
    }

    ll k = n - (i-1)*i/2 - 1;

    if(k == 0){
        cout << i << endl;
    } else {
        int g = GCD((int)k, (int)i);
        cout << i << " " << k/g << "/" << i/g << endl;
    }
}
