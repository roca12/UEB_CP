/*****************************************
  2D Hieroglyphs decoder
 ***ID: 10851
 ***Juez: UVA
 ***Tipo: Strings
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 100
#define ASCII 122
char ady[ MAX ][ MAX ];
int main(){
    int t , i , M , k  , j , c;
    scanf("%d" , &t );
    while( t-- > 0 ){
        for( i = 0 ; i < 10 && scanf("%s" , ady[ i ] ) ; ++i );
        M = strlen( ady[ 0 ]) ;

        for( j = 1 ; j < M - 1 ; ++j ){
            for( i = 8 , c = 0  ; i > 0 ; --i ){
                if( ady[ i ][ j ] == '/') c <<=1;
                else c = ( c<<1 ) | 1;
            }
            putchar( c );
        }
        printf("\n");
    }
    return 0;
}
