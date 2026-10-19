/* 
 * Autor: Juan Martinez
 * Problema: Decode the tape
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/UVA-10878#author=user:31196
 */
#include <bits/stdc++.h>
#include <string>
using namespace std;
#define ln "\n"

int main() {
    string s, res = "";
    while(getline(cin, s)) {
        int j = 128;
        int byte = 0;
        //cout<<s<<ln;
        if(s[0] == '_' || s.empty()) continue;
        for(int i = 1; i < 10; i++) {
            //cout<<s[i]<<" "<<j<<ln;
            if(s[i] == 'o') byte += j;
            if(s[i] != '.') j >>= 1;
        }
        res += char(byte);
    }
    cout<<res;
}
