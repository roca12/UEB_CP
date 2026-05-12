    /*
     * Autor: Miguel Lopez
     * Problema: Odd divisor
     * Juez online: CodeForces
     * Veredicto: Accepted
     * URL: https://codeforces.com/problemset/problem/1475/A
     */

    #include <bits/stdc++.h>
    using namespace std;
    typedef long long int ll;
     int isPowerof2(ll x) {
      return (x && !(x & x - 1));
    }
    int main()
    {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        ll t,a; cin >> t;
        for(int i = 0; i < t ; i++) {
            cin >> a;
            if (isPowerof2(a) == 1) cout << "NO" << "\n";
            else cout << "YES" << "\n";
        }
        return 0;
    }
