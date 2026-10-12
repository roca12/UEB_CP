/*
 * Autor: Juan Martinez
 * Problema: Lavencia Oranges (2274C)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/2274/problem/C
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"
#define add(x) push_back(x)

int main() {
	int t, n, k, sum; cin>>t;
    while(t--) {
        cin>>n;
        k = 0;
        sum = 0;
        while(sum < n) {
            sum = 0;
            k++;
            for(int i  = 1; i <= k; i++) {
                sum += (k / i) * i;
            }
        }
        vector<int> arr;
        sum = 0;
        int i = 0;
            for(int j = k; j > 0; j--) {
                if(j == 1 || (((k/j)* j) <= (n-sum))) {
                //cout<<j<<ln;
                    for(int z = 0; z < (k/j); z++) {
                    i++;
                        for(int a = 0; a < j; a++) {
                            if(sum == n) break;
                            sum++;
                            arr.add(i);
                        }
                    }
                }
            }
        cout<<k<<ln;
        for(int a : arr) cout<<a<<" ";
        cout<<ln;
    }
}
