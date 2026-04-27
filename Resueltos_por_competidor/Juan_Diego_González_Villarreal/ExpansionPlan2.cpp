//
// Created by Usuario on 23/11/2025.
//
#include <bits/stdc++.h>

using namespace std;

int main() {
    cin.tie(NULL);
    ios_base::sync_with_stdio(false);
    cout.tie(NULL);
    int t;
    cin>>t;
    while(t--) {
        int n,y,x;
        cin>>n>>x>>y;
        string s;
        cin>>s;
        x = abs(x);
        y = abs(y);
        vector<vector<short>> matrx(n+1, vector<short>(n+1, -1));
        matrx[0][0] = 0;
        queue<pair<short,short> > q;
        q.push({0,0});
        bool flag = false;
        while (!q.empty()) {
            pair<short,short> p = q.front();
            q.pop();
            if (p.first == x && p.second == y) {
                flag = true;
                break;
            }
            if (matrx[p.first][p.second]==n) continue;
            if (s[matrx[p.first][p.second]]=='8'&& p.first+1<n+1 && p.second+1<n+1 && matrx[p.first+1][p.second+1]==-1) {
                q.push({p.first+1,p.second+1});
                matrx[p.first+1][p.second+1] = matrx[p.first][p.second]+1;
            }
            if (p.first+1<n+1 && matrx[p.first+1][p.second]==-1) {
                q.push({p.first+1,p.second});
                matrx[p.first+1][p.second] = matrx[p.first][p.second]+1;
            }
            if (p.second+1<n+1 && matrx[p.first][p.second+1]==-1) {
                q.push({p.first,p.second+1});
                matrx[p.first][p.second+1] = matrx[p.first][p.second]+1;
            }
        }


        if (flag) {
            cout<<"YES"<<endl;
        }else {
            cout<<"NO"<<endl;
        }
    }
}