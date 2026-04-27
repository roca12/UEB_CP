#include <bits/stdc++.h>

using namespace std;

string letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

int main() {
    string line;
    int cont = 0;
    while (getline(cin, line)) {
        stringstream ss(line);
        string s;
        while (ss>>s) {
            bool flag = false;
            for (char c: s) {
                if (letras.find(c) != string::npos) {
                    flag = true;
                    break;
                }
            }
            if (flag) cont++;
        }
        cout << cont << endl;
    }
}