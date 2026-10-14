/*
 * Autor: Miguel Lopez
 * Problema: WERTYU
 * Juez online: Kattis
 * Veredicto: Accepted
 * Url: https://vjudge.net/contest/821961#problem/A
 */

#include <bits/stdc++.h>
#define ln "\n"
#define vi vector<int> 
#define vl vector<ll> 
#define add(x) .push_back(x);
#define debug(x) cerr << x << "<------------ DEBUG" << ln;
typedef long long int ll;
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
    map<char, char> mp = {{'1', '`'}, {'2', '1'}, {'3', '2'}, {'4', '3'}, {'5', '4'}, {'6', '5'},{'7', '6'}, {'8', '7'}, {'9', '8'}, {'0', '9'}, {'-', '0'}, {'=', '-'},{'W', 'Q'}, {'E', 'W'}, {'R', 'E'}, {'T', 'R'}, {'Y', 'T'}, {'U', 'Y'},{'I', 'U'}, {'O', 'I'}, {'P', 'O'}, {'[', 'P'}, {']', '['}, {'\\', ']'},{'S', 'A'}, {'D', 'S'}, {'F', 'D'}, {'G', 'F'}, {'H', 'G'}, {'J', 'H'},{'K', 'J'}, {'L', 'K'}, {';', 'L'}, {'\'', ';'},{'X', 'Z'}, {'C', 'X'}, {'V', 'C'}, {'B', 'V'}, {'N', 'B'}, {'M', 'N'},{',', 'M'}, {'.', ','}, {'/', '.'}};
    string s;
    while(getline(cin, s)) {
    for(int i = 0; i < s.length(); i++) {
        char c = s[i];
        if(mp.count(s[i])) {
            s[i] = mp[s[i]];
        }
    }
    cout << s << ln;
    }
    
}
