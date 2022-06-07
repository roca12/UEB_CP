/**********************************************
Sum of Consecutive Prime Numbers
 ***ID: 1210
 ***Juez: UVA
 ***Tipo: Sieve
 **********************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 10015
int prime[ MAX ] , len , p[ MAX ];
void sieve(){
    memset( prime , 1 , sizeof( prime ) );
    prime[ 0 ] = 0;
    prime[ 1 ] = 0;

    for(int i = 2 ; i * i <= MAX ; ++i ){
        if( prime[ i ] ){
            for(int k = 2 ; k * i <= MAX ; ++k){
                prime[ k * i ] = 0;
            }
        }
    }
    len = 0;
    for( int i = 0 ; i < MAX ; ++i ) if( prime[ i ] ){ p[ len++ ] = i;}
}

int dp[ MAX ];

void gen(){
    int i , j;
    for( i = 0 ; i < len ; ++i ){
        int sum = p[ i ];
        dp[ sum ]++;
        for( j = i + 1 ; j < len ; ++j ){
            sum += p[ j ];
            if( sum > MAX ) break;
            dp[ sum ]++;
        }
    }
}

int main(){
    sieve();
    gen();
    int n;
    while( scanf("%d" , &n ) , n ){
        printf("%d\n" , dp[ n ] );
    }
    return 0;
}
