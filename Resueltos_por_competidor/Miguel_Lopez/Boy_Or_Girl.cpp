/*
 * Autor: Miguel Lopez
 * Problema: Boy Or Girl
 * Juez online: CodeForces
 * Veredicto: Accepted 
 * URL: https://codeforces.com/problemset/problem/236/A
 */

#include <bits/stdc++.h>
typedef long long int ll;
using namespace std;
int main()
  {              
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
     string t; cin >> t;
     set<char> hola;
      for(char a : t) {
        hola.insert(a);
      }
       if(hola.size() % 2 == 0) {
         cout << "CHAT WITH HER!" << "\n";
       }
        else {
          cout << "IGNORE HIM!" << "\n";
             }
  }
