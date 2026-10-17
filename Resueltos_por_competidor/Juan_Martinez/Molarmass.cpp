/*
 * Autor: Juan Martinez
 * Problema: Uncle Jack
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/UVA-1586
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int t; cin>>t;
    string s;
    set<char> elements = {'C', 'H', 'O', 'N'};
    map<char, double> val;
    val['C'] = 12.01;
    val['H'] = 1.008;
    val['O'] = 16.00;
    val['N'] = 14.01;
    while(t--) {
        cin>>s;
        char act;
        double num, res = 0;
        int i = 0;
        while(i < (int)s.size()) {
            act = s[i];
            i++;
            stringstream ss;
            bool b = 0;
            while(!elements.count(s[i])) {
                if(s[i] == NULL) break;
                b = 1;
                ss<<s[i];
                i++;
            }
            if(!b) num = 1; 
            else ss>>num;
            res += (num * val[act]);
            //cout<<act<<" "<<num<<ln;
        }
        cout<< fixed << setprecision(3)<<res<<ln;
    }
}
