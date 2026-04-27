#include <bits/stdc++.h>

using namespace std;

unordered_map<char,char> mapa = {
    {'A','A'},{'E','3'},
    {'H','H'}, {'I','I'},
    {'J', 'L'}, {'L', 'J'},
    {'M','M'}, {'O', 'O'},
    {'S','2'}, {'T', 'T'},
    {'U', 'U'}, {'V', 'V'},
    {'V', 'V'}, {'W', 'W'},
    {'X', 'X'}, {'Y', 'Y'},
    {'Z', '5'}, {'1', '1'},
    {'2', 'S'},{'3','E'},
    {'5', 'Z'}, {'8', '8'},
};

bool isMirrored(string s) {
    string temp = s;
    for (int i = 0; i < s.length(); i++) {
        if (mapa.find(s[i])!=mapa.end()) {
            s[i] = mapa[s[i]];
        }else {
            s[i] = ' ';
        }
    }
    reverse(s.begin(), s.end());
    return s == temp;
}

bool isPali(string s) {
    string temp = s;
    reverse(temp.begin(), temp.end());
    return s == temp;
}

int main() {
    string s;
    while (getline(cin, s)) {
        bool pali = isPali(s);
        bool mirror = isMirrored(s);
        if (pali && mirror) {
            cout <<s<<" -- is a mirrored palindrome."<<endl;
        }else if (pali) {
            cout <<s<<" -- is a regular palindrome."<<endl;
        }else if (mirror) {
            cout<<s<<" -- is a mirrored string."<<endl;
        }else {
            cout<<s<<" -- is not a palindrome."<<endl;
        }
        cout<<endl;
    }
}
