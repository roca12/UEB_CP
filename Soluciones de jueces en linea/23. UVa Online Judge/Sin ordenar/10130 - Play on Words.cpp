/*****************************************
 Play on Words
 ***ID: 10130
 ***Juez: UVA
 ***Tipo: DP, Knapsack
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int dp[ 305 ] , w[ 1005], v[ 1005 ];
int main(){

    int t, n , p, capacity, x;
    scanf("%d" , &t );
    while( t-- ){
        scanf("%d" , &n);
        for( int i = 0 ; i < n ; ++i ) scanf("%d %d" , &v[ i ] , &w[ i ] );
        scanf("%d" , &p );
        capacity = 0;
        while( p-- ){

            scanf("%d" , &x );
            memset( dp , 0 , sizeof( dp ) );
            for( int i = 0 ; i < n ; ++i ){
                for( int j = x ; j >= w[ i ] ; --j ){
                     dp[ j ] = max( dp[ j ] , dp[ j - w[ i ] ] + v[ i ] );
                }
            }
            capacity += dp[ x ];
        }
        printf("%d\n" , capacity );
    }

    return 0;
}
