/*
 * Autor: Jorge Nuñez
 * Problema: Min Max Game
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2263/A
 */
#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int>
#define vll vector<ll>
#define vp vector<pair<ll , ll>>
#define dbg(x) cerr << x << " <-----" << "DEBUG" << ln;
using namespace std;
typedef long long int ll;
#define all(x) (x).begin(), (x).end()
#define add(x) push_back(x)
const int INF = 1e9;
int main() {
    ios::sync_with_stdio(false);
	cin.tie(nullptr);

    int c;
    cin>>c;

    while(c--){
        int a; cin>>a;
        bool b;
        vi sida(a);

        for(int i =0 ; i<a;i++){
        cin>>sida[i];
        }

        unordered_map<int, int> sida2;

    for (int x : sida) {
        sida2[x]++;
    }
    if(sida2[1]>=sida2[0]){
        cout<<"Bessie"<<ln;
    }else{
        cout<<"Elsie"<<ln;
    }
    

    }
}