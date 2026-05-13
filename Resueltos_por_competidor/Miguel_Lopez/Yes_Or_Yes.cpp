
/*
 * Autor: Miguel Lopez
 * Problema: Yes or Yes
 * Juez online: CodeForces
 * Veredicto: Accepted 
 * URL: https://codeforces.com/contest/2178/problem/A
 */

#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll t; cin >> t;
    for(int i = 0; i < t; i++) {
        ll conty = 0;
        string a; cin >> a;
        for(char c : a) {
            if(c == 'Y') {
            	conty++;
            }
        }
        if(conty <= 1)  {
        	cout << "YES" << endl;
        }
        else{
        	cout << "NO" << endl;	
        }           
    }
}
