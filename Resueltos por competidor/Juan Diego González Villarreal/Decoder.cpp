//
// Created by Usuario on 18/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    string line;
    while (getline(cin ,line)) {
        string temp;
        for (char c : line) {
            temp += c-7;
        }
        cout << temp << endl;
    }
}