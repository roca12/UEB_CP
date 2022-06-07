/*****************************************
Continents
 ***ID: 11094
 ***Juez: UVA
 ***Tipo: Graph Theory, Flood Fill
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
int h , w;
#define MAX 22
char ady[ MAX ][ MAX ];
bool seen[ MAX ][ MAX ];
int cnt;
void dfs( int x , int y , char c ){
    if( x > h  ||  x < 0 || ady[ x ][ y ] != c || seen[ x ][ y ]  ) return;
    cnt++;
    seen[ x ][ y ] = 1;
    dfs( x + 1 , y , c );
    dfs( x , ( y + 1 ) % w , c );
    dfs( x - 1 , y , c );
    dfs( x , ( w + ( y - 1 ) ) % w , c );
}

int main(){
    int xini , yini;
    while( scanf("%d %d" , &h , &w ) != EOF ){
        for( int i = 0 ; i < h ; ++i ) scanf("%s" , ady[ i ] );
        scanf("%d %d" , &xini , &yini );
        int maxi = 0;
        memset( seen, 0 , sizeof( seen ) );
        dfs( xini , yini , ady[ xini ][ yini ] );
        for( int i = 0 ; i < h ; ++i ){
            for( int j = 0 ; j < w ; ++j ){
                if( !seen[ i ][ j ] && ady[ i ][ j ] == ady[ xini ][ yini ] ){
                    cnt = 0;
                    dfs( i , j , ady[ xini ][ yini ] );
                    maxi = ( maxi < cnt )? cnt : maxi;
                }
            }
        }
        printf("%d\n" , maxi );
    }

    return 0;
}
