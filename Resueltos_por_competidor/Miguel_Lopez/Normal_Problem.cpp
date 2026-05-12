    /*
     * Autor: Miguel Lopez
     * Problema: Normal Problem
     * Juez online: CodeForces
     * Veredicto: Accepted
     * URL: https://codeforces.com/problemset/problem/2044/B
     */
#include <bits/stdc++.h>
typedef long long int ll;
using namespace std;
int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t; cin >> t;
    string a;
    for(int i = 0; i < t ; i++) {
        cin >> a;
        string b = "";
        for(int j = a.length()-1 ; j >= 0 ; j-- ) {
            char c = a[j];
            if(c == 'p') {
                b+='q';
            }
            else if (c == 'q') {
                b+='p';
            }
            else {
                b+=c;
            }
        }
        cout << b << endl;
    }
}
