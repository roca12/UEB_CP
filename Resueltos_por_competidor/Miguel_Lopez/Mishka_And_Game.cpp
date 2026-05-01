
/*
 * Autor: Miguel Lopez
 * Problema: Mishka and Game
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/703/problem/A
 */
#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
    int t,a,b,contA = 0, contB = 0; cin >> t;
    for(int i = 0; i < t ; i++) {
        cin >> a >> b;
        if(a > b) {
            contA++;
        }
        if(a < b) {
            contB++;
        }
    }
        if(contA > contB) {
            cout << "Mishka";
        }
        else if(contB > contA) {
            cout << "Chris";
        }
        else {
            cout << "Friendship is magic!^^";

        }

}
