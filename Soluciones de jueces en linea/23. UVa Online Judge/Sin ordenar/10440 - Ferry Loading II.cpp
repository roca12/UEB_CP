/*****************************************
 Ferry Loading
 ***ID: 10440
 ***Juez: UVA
 ***Tipo: Greedy
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

int main(){
    int t , q , n ,m , k, total;
    int viajes , x , aux , paso , j , l;
    scanf("%d" , &q );
    while( q-- ){

        scanf("%d %d %d" , &n ,&t ,&m );

        l = m%n; k = m/n;
        total = 0; viajes = k;

        if( l ){
            viajes++;
            for( int i = 0 ; i < l ; ++i ){
                scanf("%d" , &x );
                total =  x + 2 *t;
            }
        }

        for( int i = 0 ; i < k ; ++i ){
            for( int j  = 0 ; j < n ; ++j )
                scanf("%d" , &x );
            if( x <= total ) total += 2*t;
            else total = x + 2 * t;
        }

        printf("%d %d\n" , total - t , viajes );

    }

    return 0;
}
