/*
Autor : SayisC
Problema : Minimize!
Juez online : 
Veredicto : Accepted
Url : https://codeforces.com/contest/2009/problem/A
*/

#include <iostream>
using namespace std; 
#define print(x) cout << x << "\n"
 
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t; 
    cin >> t;
    while(t--){
        int a, b;
        cin >> a >> b;
        int r = b - a;
        print(r);
    }
}
