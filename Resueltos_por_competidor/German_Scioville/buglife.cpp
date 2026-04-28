/*
 * Autor: Scioville
 * Problema: BUGLIFE - A Bug’s Life (https://www.spoj.com/problems/BUGLIFE/)
 * Juez online: Spoj
 * Veredicto: accepted  
 * The way you glow through my blinds in the morning....
 * */
#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;

bool isBipartite(vector<vector<int>> &g,int V) {
    vector<int>colorArr(V,-1);
    for(int i = 0;i<V;i++){
        if(colorArr[i]== -1){
            queue<int> q;
            colorArr[i]=1;
            q.push(i);

            while(!q.empty()){
                int u = q.front();
                q.pop();

                for(int v:g[u]){
                    if(colorArr[v] == -1){
                        colorArr[v] = 1 - colorArr[u];
                        q.push(v);
                    }else if(colorArr[v] == colorArr[u]){
                    return false;
                    }
                }
            }
        }
    }
    return true;
    }

int main() {
    int t,x,y,a,b;
    cin >>t;
   for(int i = 1;i<=t;i++){
    cin>>x>>y;
    vector<vector<int>> g;
    g.resize(x);
    for(int j = 0;j<y;j++){
        cin>>a>>b;
        g[a-1].push_back(b-1);
        g[b-1].push_back(a-1);
    }

    cout << "Scenario #"<< i <<":"<< endl;
    if (isBipartite(g,x)) {
        cout << "No suspicious bugs found!" << endl;
    } else {
        cout << "Suspicious bugs found!" << endl;
    }

    }
}
