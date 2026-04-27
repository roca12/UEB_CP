#include <bits/stdc++.h>

using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        string s,b;
        cin>>s>>b;
        vector<int> freq(256, 0);
        int count = 0;
        for (char c: s)freq[c]++,count++;
        string temp;
        for (char c: b) {
            if (freq[c]==0) temp+= c;
            else freq[c]--, count--;
        }
        if (count>0) {
            cout<<"Impossible"<<endl;
            continue;
        }
        sort(temp.begin(), temp.end());
        int i = 0, j = 0;
        string ans;
        while (i<temp.size() && j<s.size()) {
            if (temp[i]<s[j])ans+=temp[i], i++;
            else ans+=s[j], j++;
        }
        while (i<temp.size())ans+=temp[i], i++;
        while (j<s.size())ans+=s[j], j++;
        cout<<ans<<endl;
    }

}