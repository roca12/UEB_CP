/*****************************************
  Factstone Benchmark
 ***ID: 10916
 ***Juez: UVA
 ***Tipo: Logaritmos
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 1000000
double f[ MAX ];
//2^( 2 ^( y + 1 ) ) > n!
int main(){
    int year , y , n , i;
    f[ 0 ] = log( 1 );
    for( i = 1 ; i < MAX ; ++i )
        f[ i ] = log( i ) + f[ i - 1 ];

    int left , right , mid;
    while( scanf("%d" , &year ) , year ){
        y = ( year - 1960 )/10;
        left = 0; right = MAX;
        while( left < right ){
            mid = ( left + right )>>1;
            if( f[ mid ] > (double)( 1<<( y + 2 ) ) * log( 2 ) ) right = mid;
            else left = mid + 1;
        }
        printf("%d\n" , right - 1 );
    }
    return 0;
}

