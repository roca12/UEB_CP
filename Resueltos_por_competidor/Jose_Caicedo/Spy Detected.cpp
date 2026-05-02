/*
* Autor: BlackJose17
* Problema: Spy Detected!
* Juez Online: Codeforces
* Veredicto: Accepted
* URL: https://codeforces.com/problemset/problem/1512/A
**/

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    while (n--) {
        int t;
        cin >> t;
        vector<int> a(t);
        for (int i = 0; i < t; i++) {
            cin >> a[i];
        }
        int mayoria;
        if (a[0] == a[1]) mayoria = a[0];
        else if (a[0] == a[2]) mayoria = a[0];
        else mayoria = a[1];

        for (int i = 0; i < t; i++) {
            if (a[i] != mayoria) {
                cout << i + 1 << endl;
                break;
            }
        }
    }

    return 0;
}
