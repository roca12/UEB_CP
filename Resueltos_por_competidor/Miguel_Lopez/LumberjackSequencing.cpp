/*
 * Autor: Miguel Lopez
 * Problema: Lumberjack Sequencing
 * Juez online: OnlineJudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/UVA-11942
 */

#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int> 
#define vl vector<ll> 
#define add(x) .push_back(x);
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
    //init_code();
    int t; cin >> t;
    cout << "Lumberjacks:" << ln;
    while(t--) {
        vi vec(10);
        for(int &i : vec) {
            cin >> i;
        }
        bool asc = true, desc = true;
        for(int i = 1; i < vec.size(); i++) {
            if(vec[i-1] < vec[i]) asc = false;
            if(vec[i-1] > vec[i]) desc = false;
        }
        if(asc || desc) cout << "Ordered" << ln;
        else cout << "Unordered" << ln;
    }
}
