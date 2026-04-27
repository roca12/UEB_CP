#include <bits/stdc++.h>
using namespace std;

int main() {
    int temp, total = 1;
    for (int i  = 0; i<10; i++) {
        cin>>temp;
        total *= (temp+1);
    }
    cout<<total-1<<endl;
}
