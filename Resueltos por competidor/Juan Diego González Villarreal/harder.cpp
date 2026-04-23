#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin>>n;
    int days = 1;
    int max;
    cin>>max;
    for (int i = 1; i<n ;i++) {
        int num;
        cin>>num;
        if (num>max) {
            max = num;
            days++;
        }
    }
    cout<<days<<endl;
}
