#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    unordered_map<char,char> rot = {
        {'0','0'},
        {'1','1'},
        {'2','2'},
        {'5','5'},
        {'6','9'},
        {'9','6'},
        {'8','8'},
        {'3','E'},
        {'E','3'}
    };

    string s;
    cin >> s;
    int n = s.size();
    long long ans = 0;

    vector<char> keys;
    for(auto &p: rot) keys.push_back(p.first);

    for(int l=0, r=n-1; l<r; l++, r--){
        int best = INT_MAX;
        for(char a: keys){
            char b = rot[a];
            int cost = (s[l]!=a) + (s[r]!=b);
            best = min(best, cost);
        }
        ans += best;
    }

    if(n%2==1){
        int mid=n/2;
        int best=INT_MAX;
        for(char a: keys){
            if(rot[a]==a)
                best = min(best, int(s[mid]!=a));
        }
        ans += best;
    }

    cout << ans << endl;
}
