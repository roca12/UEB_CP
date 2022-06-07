/*****************************************
 Graph Construction
 ***ID: 10720
 ***Juez: UVA
 ***Tipo: Graph Theory
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
bool cmp( int n1 , int n2 ){
    return n2 < n1;
}

int main(){
    int n, d[ 10005 ] , sum, sum2;
    bool p;
    while( scanf("%d" , &n ) , n ){
        sum = 0;
        p = true;
        for( int i = 1 ; i <= n ; ++i ){
            scanf("%d" , &d[ i ] );
            sum += d[ i ];
            if( d[ i ] < 0 ) p = false;
        }
        if( ( sum & 1 ) || !p ){
            puts("Not possible");
            continue;
        }
        sort( d + 1 , d + n + 1 , cmp  );
        for( int k = 1 ; k <= n ; ++k ){
            sum = 0;
            for( int i = 1 ; i <= k ; ++i ){
                sum += d[ i ];
                sum2 = k * ( k - 1 );
                for( int j = k + 1 ; j <= n ; ++j ){
                    sum2 += min( k , d[ j ] );
                }
                if( sum > sum2 ){
                    p = false;
                    break;
                }
            }
            if( !p ) break;
        }
        if( !p )puts("Not possible");
        else puts("Possible");
    }

    return 0;

}
