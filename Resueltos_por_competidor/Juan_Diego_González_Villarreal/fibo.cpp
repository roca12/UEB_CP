#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

struct M22 {
     ll a[2][2]; 
};
struct M21 {
     ll a[2]; 
};

const ll MOD = 1000000007LL;
const M22 I = {{{1,0},{0,1}}};

M22 matmul(const M22 &x, const M22 &y){
    M22 r = {{{0,0},{0,0}}};
    for(int i=0;i<2;i++)
        for(int j=0;j<2;j++)
            for(int k=0;k<2;k++)
                r.a[i][j] = (r.a[i][j] + x.a[i][k]*y.a[k][j]) % MOD;
    return r;
}

M22 mpow(const M22 &b, ll n){
    M22 tmp;
    if(n==0) return I;
    if(n==1) return b;
    if(n%2==0){
        tmp = mpow(b, n/2);
        return matmul(tmp, tmp);
    } else {
        tmp = mpow(b, (n-1)/2);
        return matmul(matmul(tmp, tmp), b);  
    }
}


M21 mult(const M22 &b, const M21 &c){
    M21 ans;
    ans.a[0] = (b.a[0][0]*c.a[0] + b.a[0][1]*c.a[1]) % MOD;
    ans.a[1] = (b.a[1][0]*c.a[0] + b.a[1][1]*c.a[1]) % MOD;
    return ans;
}


ll fib(ll n){
    M22 b = {{{1,1},{1,0}}};
    M21 c = {{0,1}};                  
    M22 p = mpow(b, n);
    M21 a = mult(p, c);
    return a.a[0];                    
}

int main(){
    int t;
    cin>>t;
    while(t--){
        ll n,m;
        cin>>n>>m;
        ll ans = (fib(m+2) - fib(n+1) + MOD) % MOD;   
        cout<<ans<<"\n";
    }
}