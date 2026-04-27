#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie();
    cout.tie();

    int t;
    cin >> t;
    while(t--){
        int n, m;
        cin >> n >> m;
        if(n == 1 && m == 1){
            cout << "0"<<endl;
        }
        else if(min(n, m) == 1){
            cout << "1"<<endl;
        }
        else cout << "2"<<endl;
    }
}