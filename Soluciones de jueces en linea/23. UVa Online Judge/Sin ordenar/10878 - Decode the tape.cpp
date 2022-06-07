/*****************************************
  Decode the tape
 ***ID: 10878
 ***Juez: UVA
 ***Tipo: Strings
 ******************************************/
#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 30
char s[ MAX ];
int main(){
    int len , i , c;
    while( gets( s ) ){
        if( s[ 0 ] == '_' ) continue;
        len = strlen( s );
        c = 0;
        for( i = len - 2 ; i > 0 ; --i ){
            if( s[ i ] == 'o' ) c |= 1<<( len - i - 2  );
            else if( s[ i ] == '.' ) len--;
        }
        putchar( c );
    }
    return 0;
}
