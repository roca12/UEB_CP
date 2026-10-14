/*
 * Autor: Miguel Lopez
 * Problema: Molar Mass
 * Juez online: OnlineJudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/contest/821961#problem/C
 */

#include <bits/stdc++.h>
#include <cctype>
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
    init_code();
    map<char,float> hardcode = {{'C', 12.01}, {'H', 1.008}, {'O', 16.00}, {'N', 14.01}};
    int t; cin >> t;
    while(t--) {
        map<char,int> freq;
        double res = 0;
        string s; cin >> s;
            for(int i = 0; i < s.length(); i++) {
                char c = s[i];
                int j = i+1;
                if(hardcode.count(c)) {
                    string aux2;
                    while(j < s.length() && isdigit(s[j])) {
                        char help = s[j];
                        aux2+=help;
                        j++;
                    }
                    //debug(aux2);
                    int aux = 1;
                    if(!aux2.empty())
                        aux = stoi(aux2);
                    freq[c]+=aux;
                }
        }
        for(auto i : freq) {
                    //debug(hardcode[i.first]);
                    res+=(hardcode[i.first] * i.second);
        }
        cout << fixed << setprecision(3) << res << ln;
    }
}
