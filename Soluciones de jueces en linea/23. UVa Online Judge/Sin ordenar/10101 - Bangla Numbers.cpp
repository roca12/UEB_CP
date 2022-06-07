/*****************************************
  Bangla Numbers
 ***ID: 10101
 ***Juez: UVA
 ***Tipo: Ad hoc
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

int a[ 5 ] = { 10000000 , 100000 , 1000 , 100 };
char s[ 5 ][ 6 ] = { "kuti" , "lakh" , "hajar" , "shata"  };

int main(){

    long long n , res , div , d , r;
    int q = 1 , i , j;
    while( scanf("%lld" , &n ) != EOF ){
        printf("%4d." , q++ );
        if( !n ){
            printf(" 0\n");
            continue;
        }
        for( i = 0 ; i < 4 ; ++i ){
            div = n / a[ i ];
            if( div > 0 ){
                while( div > 99 ){
                    for( j = 0 ; j < 4 ; ++j ){
                       d = div / a[ j ];
                       if( d > 0 ) printf(" %lld %s" , d , s[ j ] );
                       div %= a[ j ];
                    }
                }
                if( div > 0 ) printf(" %lld %s" , div , s[ i ] );
                else printf(" %s" , s[ i ] );
            }
            n = n % a[ i ];
        }
        if( n > 0 ) printf(" %d" , n );
        printf("\n");
    }

    return 0;
}
