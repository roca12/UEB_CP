#include<bits/stdc++.h>
#include<cstdlib>
#define all(x) x.begin(),x.end()
using namespace std;
string ReplaceAll(string str, const string& from, const string& to) {
    size_t start_pos = 0;
    while((start_pos = str.find(from, start_pos)) != std::string::npos) {
        str.replace(start_pos, from.length(), to);
        start_pos += to.length();
    }
    return str;
}
int main(){
    //freopen("input.txt", "r", stdin);
    int n;
    cin>>n;
    while(n--){
        string s;
        cin>>s;
        int t = (int) s.size()/2;
        for(int i=0;i<t;i++){
            s = ReplaceAll(s, "[]", "");
            s = ReplaceAll(s, "()", "");
        }
        cout<<((!(int)s.size())?"Yes":"No")<<endl;
    }
    return 0;
}
