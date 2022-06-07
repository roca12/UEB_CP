/*****************************************
  Trouble of 13-Dots
 ***ID: 10819
 ***Juez: UVA
 ***Tipo: DP , knapsack
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 105
#define MAXN 10500
int n , m , dp[ MAX ][ MAXN ] , a[ MAX ] , val[ MAX ];
int main(){
    int ans;
    while( scanf("%d %d" , &m , &n ) != EOF ){
        for( int i = 1 ; i <= n ; ++i ){
            scanf("%d %d" , &a[ i ] , &val[ i ] );
        }
        memset( dp , 0 , sizeof( dp ) );
        for( int i = 1 ; i <= n ; ++i ){
            for( int j = 1 ; j <= MAXN - 100 ; ++j ){
                if( j - a[ i ] >= 0 ){
                    if( j == a[ i ] ) 
						dp[ i ][ j ] = max( dp[ i - 1 ][ j - a[ i ] ] + val[ i ] , dp[ i - 1 ][ j ] );
                    else if( dp[ i - 1 ][ j - a[ i ] ] )  
						dp[ i ][ j ] = max( dp[ i - 1 ][ j - a[ i ] ] + val[ i ] , dp[ i - 1 ][ j ] );
                    else 
						dp[ i ][ j ] = dp[ i - 1 ][ j ];
                }
                else 
					dp[ i ][ j ] = dp[ i - 1 ][ j ];
            }
        }
        ans = 0;
        for( int i = 0 ; i <= MAXN - 100 ; ++i ){
            if( i > 2000 && i - 200 <= m ) ans = max( ans , dp[ n ][ i ] );
            else if( i <= m )ans = max( ans , dp[ n ][ i ] );
        }
        printf("%d\n" , ans );
    }
    return 0;
}
