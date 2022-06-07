/*****************************************
 Yet another Number Sequence
 ***ID: 10689
 ***Juez: UVA
 ***Tipo: Fibonacci
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
int mod[] = { 1 , 10 , 100 , 1000 , 10000 };
int val[] = { 1 , 60 , 300 , 1500 , 15000 };
int main(){
    int t , i , a , b , n , m , c , tmp;
    scanf("%d" , &t );
    while( t-- > 0 && scanf("%d %d %d %d" , &a , &b , &n , &m ) ){
        a %= mod[ m ]; b %= mod[ m ];
        n %= val[ m ];
        if( n == 0 ){
            printf("%d\n" , a );
            continue;
        }
        else if( n == 1 ){
            printf("%d\n" , b );
            continue;
        }
        for( i = 2 ; i <= n ; ++i ){
            c = ( a + b ) % mod[ m ];
            a = b;
            b = c;
        }
        printf("%d\n" , c );
    }

    return 0;
}
