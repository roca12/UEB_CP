/*****************************************
 Word Problem
 ***ID: 895
 ***Juez: UVA
 ***Tipo: Sort, String
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 1005
bool isLetter(char c){return c>='A' && c<='Z' || c>='a' && c<='z';}
char s[ 55 ];
int a[ MAX ][ 27 ] ,aux[ 27 ];
int main(){
    int i , len = 0 , j , cnt;
    while( scanf("%s", &s ) , s[ 0 ] != '#'){
        for( i = 0 ; s[ i ] ; ++i ) a[ len ][ s[ i ] - 'a' ]++;
        len++;
    }
    gets( s );
    while( gets( s ) , s[ 0 ] != '#' ){
        memset( aux , 0 , sizeof( aux ) );
        for( i = 0 ; s[ i ] ; ++i ){

            if( isLetter( s[ i ] ))aux[ s[ i ] - 'a' ]++;
        }
        cnt = 0;
        for( i = 0 ; i < len ; ++i ){
            for( j = 0 ; j < 26 ; ++j ){
                if( a[ i ][ j ] > aux[ j ] ) break;
            }
            if( j == 26 ) cnt++;
        }
        printf("%d\n" , cnt );
    }

    return 0;
}
