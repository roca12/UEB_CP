/*
* Autor: BlackJose17
* Problema: A+B Again?
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/1999/A
**/

#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n;
        cin >> n;
        cout << n / 10 + n % 10 << endl;
    }

    return 0;
}
