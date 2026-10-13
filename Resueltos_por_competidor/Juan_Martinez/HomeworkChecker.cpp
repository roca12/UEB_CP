/*
 * Autor: Juan Martinez
 * Problema: Homework Checker (11878)
 * Juez online: Online Judge
 * Veredicto: Accepted
 * Url: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3000
 */
#include <bits/stdc++.h>

using namespace std;

#define ln "\n"
typedef long long int ll;

int main() {
    string s;
    int resultadoReal = 0;
    while(cin>>s) {
        string op1 = "", op2 = "", res = "";
        int op, ope, resu;
        for(int i = 0; i < (int)s.size(); i++) {
            if(s[i] != '0' && s[i] != '1' && s[i] != '2' && s[i] != '3' && s[i] != '4' &&
            s[i] != '5' && s[i] != '6' && s[i] != '7' && s[i] != '8' && s[i] != '9') {
                op = i;
                ope = i;
                break;
            } else op1.push_back(s[i]);
        }
        for(int i = (op+1); i < (int)s.size(); i++) {
            if(s[i] == '=') {
                op = i;
                break;
            } else op2.push_back(s[i]);
        }
        for(int i = (op+1); i < (int)s.size(); i++) res.push_back(s[i]);
        stringstream ss1, ss2, ss3;
        int x, y;
        ss1.str(op1);
        ss1>>x;
        ss2.str(op2);
        ss2>>y;
        if(s[ope] == '+') {
            resu = x + y;
            ss3<<resu;
            if(ss3.str() == res) resultadoReal++;
        } else {
            resu = x - y;
            ss3<<resu;
            if(ss3.str() == res) resultadoReal++;
        }
        //cout<<op1<<" "<<op2<<" "<<res<<ln;
    }
    cout<<resultadoReal<<ln;
}
