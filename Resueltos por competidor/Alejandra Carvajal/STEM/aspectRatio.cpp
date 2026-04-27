#include <bits/stdc++.h>
using namespace std;

int main() {
    int t;
    cin>> t;
    
    for(int i=1; i<=t; i++){
        double k;
        cin>>k;
        
        double D = sqrt((k*k -1.0) / (4.0 - k*k));
        cout<< "Case " << i << ": " << fixed << setprecision (4) << D <<           endl;
    }
    return 0;
}
