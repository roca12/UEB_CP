#include <bits/stdc++.h>



using namespace std;


int main() {
    int t;
    cin>>t;
    while(t--) {
        int n;
        cin>>n;
        vector<int> cnt(n+1);
        for (int i = 1; i <= n; i++) {
            int val;
            cin>>val;
            cnt[val]++;
        }
        vector<int> kids;
        for (int i = 1; i <= n; i++) {
            if (cnt[i]>0) kids.push_back(cnt[i]);
        }
        sort(kids.begin(), kids.end());

        for (int i = 0; i < n; i++) {
            kids[i]-=(i+1);
        }
        for (int i = 0; i < kids.size(); i++) {
            if (kids[i]<0) {
                kids.erase(kids.begin()+i);
            }
        }
        priority_queue<int> pq;
        for (int i = 0; i < kids.size(); i++) {
            pq.push(kids[i]);
        }
        int cont = 0;
        while (pq.size() > 1) {
            int val = pq.top();
            pq.pop();
            if (val>0) {
                pq.push(val);
            }
            cont++;
        }
        cout<<cont<<endl;
    }
}