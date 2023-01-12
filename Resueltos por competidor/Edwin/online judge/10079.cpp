#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long int ll;
template< class T > 
const T& max( const T& a, const T& b );
int main() {
    while(true){
        ll n;
        cin>>n;
        if(n<0)break;
        cout<<((n*(n+1))/2)+1<<endl;
    }
    return 0;
}
