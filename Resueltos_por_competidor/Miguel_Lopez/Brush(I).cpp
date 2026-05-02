/*
 * Autor: Miguel Lopez
 * Problema: Brush (I)
 * Juez online: LightOJ
 * Veredicto: Accepted 
 * URL: https://lightoj.com/problem/brush-1
 */

#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t,a; cin >> t;
    for(int i = 0; i < t ; i++) {
        int op = 0;
        cin >> a;
        for(int j = 0; j < a ; j++) {
            int b; cin >> b;
            if(b < 0) {
                
            }
            else {
            op+=b;
            }
        }
        cout << "Case " << i+1 << ": " << op << endl;
    }
}

