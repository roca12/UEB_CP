/*
* Autor: BlackJose17
* Problema: Design Tutorial: Learn from Math
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/472/A
**/

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;

    if (n % 2 == 0) {
        cout << 4 << " " << n - 4 << endl;
    } else {
        cout << 9 << " " << n - 9 << endl;
    }

    return 0;
}
