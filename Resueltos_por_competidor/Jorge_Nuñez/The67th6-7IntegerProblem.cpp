/*
 * Autor: Jorge Nuñez
 * Problema: The 67th 6-7 Integer Problem
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/2218/B
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

     int x;cin>>x;
    
    while(x--){
        vi aura(7);
        int sum=0;
        for(int i =0;i<aura.size();i++){
            cin>>aura[i];
        }
        sort(all(aura));

        for(int i =0;i<aura.size();i++){
            if (i==6){
                sum+=aura[i];

            }else{
                sum-=aura[i];
         
        }
        }
        cout<<sum<<ln;
        sum=0;



    
      
}
}