/*****************************************
 Brick Wall Patterns
 ***ID: 900
 ***Juez: UVA
 ***Tipo: Fibonacci Numbers, math
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int main(){

    int n;
    long long dp[51];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=50;i++){
       dp[i]=dp[i-1]+dp[i-2];
    }
    while(scanf("%d",&n) && n){
        printf("%lld\n",dp[n]);

    }
    return 0;
}
