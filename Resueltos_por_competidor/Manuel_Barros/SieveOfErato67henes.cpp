#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin>>t;

    while(t--) {
        int n;
        cin>>n;
        bool elOtro = false;
        while(n--) {
            int k;
            cin>>k;
            if(k==67) elOtro = true;
        }
        cout << ((elOtro)?"Yes\n":"No\n");
    }
}
