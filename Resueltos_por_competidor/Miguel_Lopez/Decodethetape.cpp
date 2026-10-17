/*
 * Autor: Miguel Lopez
 * Problema: Decode the tape 
 * Juez online: OnlineJudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/UVA-10878
 */

#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int> 
#define vl vector<ll> 
#define add(x) .push_back(x);
#define debug(x) cerr << x << "<------------ DEBUG" << ln;
typedef long long int ll;
const int INF = int(1e9) + 5;
using namespace std;
void init_code() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    #ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    #endif 
}
int main() {
   // init_code();
    string s;
    while (getline(cin, s)) {
        if (s.empty() || s[0] != '|') continue;
        string aux;
        for (int i = 1; i < (int)s.size(); i++) {
            char c = s[i];
            if (c == '|') break;      
            if (c == '.') continue;  
            aux+= (c == 'o' ? '1' : '0');
        }
        cout << (char)stoi(aux, nullptr, 2);
    }
}
