/*
 * Autor: Miguel Lopez
 * Problema: The 67th integer problem
 * Juez online: CodeForces
 * Veredicto: Accepted
 * URL: https://codeforces.com/contest/2218/problem/A
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
    cin >> a;
    if(a < 67){
     cout << a+1 << endl;
    }
    else {
    cout << a << endl;
    }
    }


}

