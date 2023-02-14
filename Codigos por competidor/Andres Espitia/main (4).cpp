#include <bits/stdc++.h>

using namespace std;

int main()
{
    string s;
    cin>>s;
    int sum = 0;
    for(int i=0; i<s.size(); i++){
        sum += s[i];
    }
    sum /= s.size();
    char imp = sum;
    cout<<imp;
}