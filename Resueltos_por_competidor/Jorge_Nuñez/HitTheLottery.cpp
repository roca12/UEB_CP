/*
 * Autor: Jorge Nuñez
 * Problema: Hit the Lottery
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/996/A
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

     ll x;cin>>x;
    ll sum=0;
    while(x!=0){
        if(x>=100){
            x-=100;
            sum++;
        }else if(x>=20){
            x-=20;
            sum++;
        }else if(x>=10){
            x-=10;
            sum++;
        }else if(x>=5){
            x-=5;
            sum++;
        }else if (x>=1){
            x-=1;
            sum++;
        }



    }
    
    cout<<sum<<ln;
}