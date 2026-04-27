#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        long r = 0;
        long l = 0;
        bool flag = false;
        for (int i = 0; i < s.length()-1; i++) {
            if (s[i]!='<'&&s[i+1]!='>') {
                cout << -1 << endl;
                flag = true;
                break;
            }
        }
        if (!flag)
            cout<<s.length()- min(count(s.begin(), s.end(), '<'), count(s.begin(), s.end(), '>'))<<endl;
    }
}