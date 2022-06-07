/*****************************************
 How do you add?
 ***ID: 10943
 ***Juez: UVA
 ***Tipo: DP
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>>

using namespace std;
#define MOD 1000000
#define MAX 105
int dp[ MAX ][ MAX ];
int n , K;

int solve( int sum , int k ){
    if( sum < 0 ) return 0;
    if( k == K ){
        if( sum == 0 ) return 1;
        return 0;
    }
    if( dp[ sum ][ k ] != -1 ) return dp[ sum ][ k ] % MOD;
    int cnt = 0;
    for( int i = 0 ; i <= n ; ++i ){
        cnt = ( cnt % MOD + solve( sum - i , k + 1 ) % MOD ) % MOD;
    }
    return dp[ sum ][ k ] = cnt % MOD;
}

int main(){
    while( scanf("%d %d" , &n , &K ) , n | K ){
        memset( dp , -1 , sizeof( dp ) );
        printf("%d\n" , solve( n % MOD , 0 ) );
    }
    return 0;
}
