#include <bits/stdc++.h>
using namespace std;

int main() {
    string S;
    cin >> S;
    vector<string> v(5);
    for (int i = 0; i < 5; i++) cin >> v[i];
    vector<int> mask = {0,1,2,3,4};
    bool flag = false;
    int l = 0;
    for(auto &x : v) l += x.size();
    if (l <= S.size()) {
        do {
            string perm;
            for(int i=0;i<5;i++) perm += v[mask[i]];

            for(int i=0; i + l <= S.size(); i++) {
                if(S.substr(i, l) == perm) {
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        } while(next_permutation(mask.begin(), mask.end()));
    }
    if(flag) cout << "Nooo, la polizzia"<<endl;
    else cout << "Sargento Camelas, Gracias!"<<endl;

    return 0;
}
