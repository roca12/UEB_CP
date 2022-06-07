/*****************************************
 Colin and Ryan
 ***ID: 10880
 ***Juez: UVA
 ***Tipo: Factores de un numero
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int main(){
    int t, C, R , n, len, fact[  45000 ] , l ;
    scanf("%d" , &t );
    for( int q = 1 ; q<= t ; ++q ){

        scanf("%d %d" , &C , &R );
        n = C - R;
        printf("Case #%d:" , q );
        if( n == 0 ){
            printf(" 0\n");
            continue;
        }
        len = (int)( sqrt( n ) );
        l = 0;
        for( int i = 1 ; i <= len ; ++i ){
            if( n % i == 0 ){
                fact[ l++ ] = i;
                if( i != n/i  )
                    fact[ l++ ] = n/i;
            }
        }
        sort( fact , fact + l );
        for( int i = 0 ; i < l ; ++i ){
            if( fact[ i ] > R )printf(" %d" , fact[ i ] );
        }
        printf("\n");
    }
    return 0;
}
