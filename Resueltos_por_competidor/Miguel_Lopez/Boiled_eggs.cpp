/*
 * Autor: Miguel Lopez
 * Problema: Boiled Eggs
 * Juez online: LightOJ
 * Veredicto: Accepted
 * URL: https://lightoj.com/problem/boiled-eggs
 */
#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;cin >> t;
    for(int i = 0; i < t; i++){
        int n,p,q; cin >> n >> p >> q;
        int c = 0,total = 0;
        for(int i = 0; i < n; i++){
            int w; cin >> w;
            if(cont < p && total + w <= q){
                cont++;
                total += w;
            }
        }
        cout << "Case " << c << ": " << cont << endl;
    }
}

