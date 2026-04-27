#include<bits/stdc++.h>
using namespace std;

int charToVal(char c) {
    return c - '0';
}

int toDecimal(string s, int base) {
    int res = 0;
    for (char c : s) {
        res = res * base + charToVal(c);
    }
    return res;
}

int greatestDigit(string s) {
    int m = 0;
    for (char c:s) {
        if (charToVal(c) > m) m = charToVal(c);
    }
    return (m+1);
}

int main() {
    string a,b;
    int c, ax = 0, bx = 0;
    cin>>a>>b>>c;
    for (int i = greatestDigit(a); i<=10; i++) {
        for (int j = greatestDigit(b); j<=10; j++) {
            ax = toDecimal(a,i), bx = toDecimal(b,j);
            if (ax+bx == c) {
                cout<<i<<" "<<j<<endl;
                return 0;
            }
        }
    }
}
