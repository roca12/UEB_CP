/*****************************************
  B2-Sequence
 ***ID: 11063
 ***Juez: UVA
 ***Tipo: Ad hoc
 ******************************************/
#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

#define MAX 105
int a[ MAX ], seen[ 20005 ],n;

bool b2(){
    int i , j;
    if( a[ 0 ] < 1 ) return false;
    for( i = 0 ; i < n ; ++i ){
        if( i && a[ i ] < a[ i - 1 ] ) return false;
        for( j = i ; j < n ; ++j ){
            if( seen[ a[ i ] + a[ j ] ] ){
                return 0;
            }
            seen[ a[ i ] + a[ j ] ] = 1 ;
        }
    }
    return true;
}

int main(){
    int i , j , q = 1;
    while( scanf("%d" , &n ) != EOF ){
        memset( seen , 0 , sizeof( seen ) );
        for( i = 0 ; i < n && scanf("%d" , &a[ i ] ) ; ++i );

        printf("Case #%d: " , q++ );
        if( b2() ) puts("It is a B2-Sequence.");
        else puts("It is not a B2-Sequence.");
        printf("\n");
    }

    return 0;
}
