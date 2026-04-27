//
// Created by Usuario on 16/11/2025.
//
#include <bits/stdc++.h>
#define DBG(x) cerr<<#x<<" = "<<x<<endl;
typedef long long ll;

using namespace std;

int main() {
    int t;
    scanf("%d",&t);
    while (t-->0) {
        int n;
        scanf("%d",&n);
        vector<ll> v;
        ll cost = 0;
        ll temp;
        for (int i = 0; i < n; i++) {
            scanf("%lld",&temp);
            v.push_back(temp);
        }
        while (v.size()>1) {
            auto it = min_element(v.begin(), v.end());
            n = v.size();
            int idx = it - v.begin();
            if (n==2) {
                cost+=max(v[0], v[1]);
                break;
            }
            if (idx == n-1) {
                if (v[0]>v[n-2]) {
                    cost+=v[n-2];

                }else {
                    cost+=v[0];
                }
            }else if (idx == 0) {
                if (v[1]>v[n-1]) {
                    cost+=v[n-1];

                }else {
                    cost+=v[1];

                }
            }else {
                if (*(it+1) >*(it-1)) {
                    cost+=*(it-1);

                }else {
                    cost+=*(it+1);
                }
            }
            v.erase(it);
        }
        printf("%lld\n", cost);
    }
}