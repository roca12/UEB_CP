#include <bits/stdc++.h>
using namespace std;
const int inf = 1<<30;
//simpre mira al norte al inicio

struct node {
    int prio;
    int first;
    int second;

    node(int prio, int first, int second) {
        this->prio = prio;
        this->first = first;
        this->second = second;
    }

    bool operator<(const node& b) const {
        return prio < b.prio;
    }
};


int main() {
    int m,n;
    while (cin>>m>>n) {
        char mat[m][n];
        int dist [m][n];
        node s;
        node t;
        priority_queue<node> pq;
        char dir = 'N';
        int color = 1;
        for (int i = 0; i < m; i++) {
            string s;
            getline(cin, s);
            for (int j = 0; j < n; j++) {
                mat[i][j] = s[j];
                dist[i][j]=inf;
                if (mat[i][j]=='S') {
                    s = {i,j};
                    dist[i][j] = 0;
                    pq.emplace(1,i,j);
                }else if (mat[i][j]=='T') {
                    t.first = i;
                    t.second = j;
                }
            }
        }

        while (!pq.empty()) {
            node temp = pq.top();
            pq.pop();

        }


    }
}