/*
 * Autor: Miguel Lopez
 * Problema: Maximum Sum (II)
 * Juez online: OnlineJudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/contest/822039#problem/A
 */

#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int> 
#define vl vector<ll> 
#define add(x) push_back(x);
#define debug(x) cerr << x << "<------------ DEBUG" << ln;
typedef long long int ll;
const int INF = int(1e9) + 5;
using namespace std;
void init_code() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif 
}
int main() {
    init_code();
    int t; 
    while(cin >> t && t != 0) {
        vi vec(t);
        for(int &i : vec) cin >> i;
        vi res;
        for(int x: vec) {
            if(x > 0) {
                res.add(x);
            }
        }
        if(res.empty()) {
            cout << 0;
        }
        for(int i = 0; i < (int)res.size(); i++) {
            cout << res[i] << (i+1 == (int)res.size() ? "" : " ");
        }
        cout << ln;
    } 
}
