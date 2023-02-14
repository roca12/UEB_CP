#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long int ll;
template< class T > 
const T& max( const T& a, const T& b );
vector<ll> ans;
ll cases = 1;
ll large(vector<ll>arr){
    for(int i=0;i<(int)arr.size();i++){
        int x=i+1,y=i-1,cont = 0;
        while(true){
            if(y==-1 && x==(int)arr.size()) break;
            if(y>=0){
                if(arr[y]>=arr[i]){
                    cont++;
                    y--;
                }else{
                    y = -1;
                }
            }
            if(x!=(int)arr.size()){
                if(arr[x]>=arr[i]){
                    cont++;
                    x++; 
                }else{
                    x = (int)arr.size();
                }
            }
        }
        ans[i+1] = std::max<ll>(ans[i], ((cont+1) * (arr[i])));
    }
    return ans[(int)arr.size()];
}
void solve(){
    int n;
    cin>>n;
    ans.clear();
    ans.resize(n+1);
    fill(ans.begin(), ans.end(), -1);
    vector<ll> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Case "<<(cases++)<<": "<<large(arr)<<endl;
}
int main() {
    int n;
    cin>>n;
    while(n--){
        solve();
    }
    return 0;
}
