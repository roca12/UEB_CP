/*****************************************
  Permutations
 ***ID: 941
 ***Juez: UVA
 ***Tipo: Math
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 25
char s[ MAX ];
long long n, fact[ MAX ] ,sum;
int del[ 300 ];

int main(){
    int t , i , j , len;
    fact[ 0 ] = 1;
    for( i = 1 ; i < 21 ; ++i ) fact[ i ] = i * fact[ i - 1 ];
    scanf("%d" , &t );
    while( t-- > 0 && scanf("%s %lld" , &s , &n ) ){
        len = strlen( s );
        sort( s , s + len );
        memset( del , 0 , sizeof( del ) );
        string str;
        for( i = 0 ; s[ i ] ; ++i ){
            sum = 0;
            str = "";
            for( j = 0 ; s[ j ] ; ++j ) if( !del[ s[ j ] ] ) str += s[ j ];
            for( j = i ; j < s[ j ] ; ++j )
            {
                if( sum + fact[ len - 1 ] > n ){
                    n -= sum;
                    del[ str[ j - i ] ] = 1;

                    printf("%c" , str[ j - i ] );
                    len--;
                    break;
                }
                sum += fact[ len - 1 ];
            }
        }
        printf("\n");
    }


    return 0;
}
