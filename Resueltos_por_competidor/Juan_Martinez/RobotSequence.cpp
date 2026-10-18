/*
 * Autor: Juan Martinez
 * Problema: Robot Sequence (626A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/contest/626/problem/A
 * Difficulty: 1000
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int t; cin>>t;
    string s;
    int x, y, res, a;
    cin>>s;
    res = 0;
    for(int i = 0; i < (int)s.size(); i++) {
        x = 0, y = 0, a = 0;
        for(int j = i; j < (int)s.size(); j++) {
            if(s[j] == 'D') y--;
            else if(s[j] == 'U') y++;
            else if(s[j] == 'L') x--;
            else x++;
            a++;
            //cout<<s[j]<<" "<<x<<" "<<y<<" ";
            if(x == 0 && y == 0) {
                res++;
            }
        }
        //cout<<a<<ln;
        //cout<<ln;
    }
    //cout<<ln;
    cout<<res<<ln;
}
