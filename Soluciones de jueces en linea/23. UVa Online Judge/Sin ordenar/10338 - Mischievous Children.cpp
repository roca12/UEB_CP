/*****************************************
 Mischievous Children
 ***ID: 1033
 ***Juez: UVA
 ***Tipo: Factorial
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 21
unsigned long long fact[ MAX ];
void gen(){
    fact[ 0 ] = 1;
    for( int i = 1 ; i < MAX  ; ++i ) fact[ i ] = i * fact[ i - 1 ];
}
char s[ MAX ];
int cnt[ 30 ];
int main(){
    gen();
    int t , i , q;
    scanf("%d" , &t );
    unsigned long long ans;
    for( q = 1 ; q <= t && scanf("%s" , &s ) ; ++q ){
        memset( cnt , 0 , sizeof( cnt ) );
        for( i = 0 ; s[ i ] ; ++i ) cnt[ s[ i ] - 'A' ]++;
        ans = fact[ i ];
        for( i = 0 ; s[ i ] ; ++i ){
            ans /= cnt[ s[ i ] - 'A' ];
            cnt[ s[ i ] - 'A' ]--;
        }
        printf("Data set %d: %llu\n" , q , ans );
    }

    return 0;
}
