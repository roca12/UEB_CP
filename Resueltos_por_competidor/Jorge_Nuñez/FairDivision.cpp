/*
 * Autor: Jorge Nuñez
 * Problema: Fair Division
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1472/B
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
        vi ca(a);

        for(int i =0 ; i<a;i++){
        cin>>ca[i];
        }

        unordered_map<int, int> ca2;

    for (int x : ca) {
        ca2[x]++;
    }

    int sum = ca2[1]+(ca2[2]*2);

    if(ca2[2]%2==1&&ca2[1]<2){
        cout<<"No"<<ln;

    }else if(sum%2==0&&(ca2[1]%2==0&&(ca2[2]*2)%2==0)){
        cout<<"Yes"<<ln;
    }else{
        cout<<"No"<<ln;
    }
    

    }
}