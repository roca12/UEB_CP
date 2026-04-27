#include <bits/stdc++.h>

using namespace std;


int main() {
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;

        string mat[26][26];
        bool visited[26];
        for (int i = 0; i < 26; i++) {
            visited[i] = false;
            for (int j = 0; j < 26; j++) {
                mat[i][j] = "";
            }
        }
        for (int i = 0; i < n; i++) {
            string s;
            cin>>s;
            int desde = (int)s[0] - (int)'a';
            int hasta = (int)s[s.length()-1] - (int)'a';
            if (mat[desde][hasta]!="" && s<mat[desde][hasta]) {
                mat[desde][hasta] = s;
            }else if (mat[desde][hasta]=="") {
                mat[desde][hasta] = s;
            }
        }

        int temp;
        priority_queue<int> pq;
        bool found = false;
        for (int i = 0; i < 26; i++) {
            if (found) break;
            for (int j = 0; j < 26; j++) {
                if (mat[i][j]!="") {
                    temp = i;
                    pq.push(temp);
                    found = true;
                    break;
                }
            }
        }
        int parent [26];
        parent[temp] = -1;
        visited[temp] = true;

        while (!pq.empty()) {
            temp = pq.top();
            pq.pop();
            for (int j = 0; j < 26; j++) {
                if (mat[temp][j]!="" && !visited[j]) {
                    visited[j] = true;
                    parent[j] = temp;
                    pq.push(j);
                }
            }
        }

        vector<string> res;

        if (visited[temp]) {
            for (int v = temp; v != -1; v = parent[v]) {
                if (parent[v]!= -1) res.push_back(mat[parent[v]][v]);
            }
            reverse(res.begin(), res.end());
        }

        if (res.size() == n) {
            for (int i = 0; i < n; i++) {
                if (i<n-1) cout<<res[i]<<".";
                else cout<<res[i]<<endl;
            }
        }else {
            cout<<"***"<<endl;
        }

    }
}
