#include <bits/stdc++.h>

using namespace std;

int df[] ={-1,0,1,0};
int dc[] = {0,1,0,-1};

int main() {
    int t;
    cin>>t;
    while (t-->0) {
        int f,c;
        cin>>f>>c;
        cin.ignore();
        char mat [f][c];
        pair<int,int> fire;
        pair<int,int> joe;
        int fireTime[f][c];
        int joeTime[f][c];
        queue<pair<int,int> > fireQ;
        queue<pair<int,int> > joeQ;
        for (int i=0;i<f;i++) {
            string s;
            getline(cin, s);
            for (int j=0;j<c;j++) {
                mat[i][j] = s[j];
                joeTime[i][j] = -1;
                fireTime[i][j] = -1;
                if (mat[i][j]=='J') {
                    joe = make_pair(i,j);
                    joeQ.push(joe);
                    joeTime[i][j] = 0;
                }else if (mat[i][j]=='F') {
                    fire = make_pair(i,j);
                    fireQ.push(fire);
                    fireTime[i][j] = 0;
                }
            }
        }

        while (!fireQ.empty()) {
            fire = fireQ.front();
            fireQ.pop();
            for (int i = 0; i < 4; i++) {
                int nf = fire.first+df[i];
                int nc = fire.second+dc[i];
                if (nf<0||nf>=f||nc<0||nc>=c||fireTime[nf][nc]!=-1||mat[nf][nc]=='#') continue;
                fireQ.emplace(nf,nc);
                fireTime[nf][nc] = fireTime[fire.first][fire.second]+1;
            }
        }

        int ans = -1;

        while (!joeQ.empty()) {
            joe = joeQ.front();
            joeQ.pop();

            if (joe.first == 0 || joe.second == 0 || joe.first == f-1 || joe.second == c-1) {
                ans = joeTime[joe.first][joe.second]+1;
                break;
            };

            for (int i = 0; i < 4; i++) {
                int nf = joe.first+df[i];
                int nc = joe.second+dc[i];
                if (nf<0||nf>=f||nc<0||nc>=c||joeTime[nf][nc]!=-1||mat[nf][nc]=='#') continue;
                int nextTime = joeTime[joe.first][joe.second]+1;
                if (fireTime[nf][nc]!=-1 && fireTime[nf][nc]<=nextTime)continue;
                joeTime[nf][nc] = nextTime;
                joeQ.emplace(nf,nc);
            }
        }

        if (ans == -1) {
            cout<<"IMPOSSIBLE"<<endl;
        }else {
            cout<<ans<<endl;
        }
    }
}