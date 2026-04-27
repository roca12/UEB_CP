#include<bits/stdc++.h>
using namespace std;

int main() {
    int n,c;
    cin>>n>>c;
    vector<int> v(n,0);
    for(int i = 0; i<n; i++) {
        cin>>v[i];
    }
    int m,a,b;
    cin>>m;
    for (int i = 1; i <= m; i++) {
        cin>>a>>b;
        vector<int> colors(c,0);
        for (int j = a; j <= b; j++) {
            colors[v[j-1]-1]++;
        }
        auto ptr = max_element(colors.begin(), colors.end());
        if (*ptr>(b-a+1)/2) {
            cout<<"yes "<<distance(colors.begin(), ptr)+1<<endl;
        }else {
            cout<<"no"<<endl;
        }
    }
}
