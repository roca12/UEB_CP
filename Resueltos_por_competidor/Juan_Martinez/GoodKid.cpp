/*
 * Autor: Juan Martinez
 * Problema: Good Kid (1873B)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1873/B
 * Difficulty: 800
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int t, n; cin>>t;
    while(t--) {
        cin>>n;
        int maxi = 0;
        int prod;
        vector<int> arr(n);
        for(int i = 0; i < n; i++) cin>>arr[i];
        for(int i = 0; i < n; i++) {
            prod = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) prod *= (arr[j]+1);
                else prod *= arr[j];
            }
            maxi = max(maxi, prod);
        }
         cout<<maxi<<ln;
    }
}
