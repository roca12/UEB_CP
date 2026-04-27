#include<bits/stdc++.h>
using namespace std;
int d  [4][2] = {{0,1}, {1,0}, {0, -1}, {-1,0}};
int main() {
    int t;
    cin>>t;
    while (t--) {
        int s, dir = 0;
        pair<int, int> p = {0, 0};
        cin>>s;
        int tam = s;
        vector<vector<char>> v(s,vector<char>(s,'.'));
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < tam; j++) {
                v[p.first][p.second] = '*';
                if (j!=tam-1) {
                    p.first+=d[dir][0];
                    p.second+=d[dir][1];
                }else {
                    dir = (dir+1)%4;
                    p.first+=d[dir][0];
                    p.second+=d[dir][1];
                }
            }
            if (i<2 && i%2==0) {
                tam--;
            }else if (i%2==0) {
                tam-=2;
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                cout<<v[i][j];
            }
            cout<<endl;
        }
        cout<<endl;

    }
}
