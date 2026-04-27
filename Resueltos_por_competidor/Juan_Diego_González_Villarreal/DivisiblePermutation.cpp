#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int temp = 1;
        vector<int> v(n);
        for (int i = 0; i < n; i++) v[i]=i+1;
        if (n%2==0) {
            for (int i = (n/2)-1; i >=0; i--) {
                cout << v[i] << " " << v[i+temp] << " ";
                temp+=2;
            }
        }else {
            for (int i = (n/2); i >=0; i--) {
                if (temp==1) {
                    cout << v[i] << " ";
                    temp++;
                    continue;
                }
                cout << v[i] << " " << v[i+temp] << " ";
                temp+=2;
            }
        }

        cout << endl;
    }
}