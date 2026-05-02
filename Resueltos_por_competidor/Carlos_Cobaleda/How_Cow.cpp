#include <bits/stdc++.h>
 /*
	 * Autor: Carlos Eduardo Cobaleda Moreno
	 * Problema: How Cow
	 * Juez online: LightOJ
	 * Veredicto: Accepted
	 * URL: https://lightoj.com/problem/how-cow
	 */
using namespace std;
typedef long long int ll;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t; cin >> t;
    for(int i = 0; i < t ; i++) {
        cout << "Case " << i+1 << ":" << endl;
        int x1,y1,x2,y2; cin >> x1 >> y1 >> x2 >> y2;
        int tr[x2][y2];

        int m; cin >> m;
        for(int j = 0; j < m; j++) {
            int mx, my; cin >> mx >> my;
            if(mx >= x1 && mx <= x2) {
                    if(my >= y1 && my <= y2) {
                        cout << "Yes" << endl;
                    }
                    else {
                        cout << "No" << endl;
                    }
            }
            else {
                cout << "No" << endl;
            }
        }

    }
}

