/*****************************************
 Number Sequence
 ***ID: 10706
 ***Juez: UVA
 ***Tipo: Binary Search
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 65550
long long sum[ MAX ];

int main(){
    for( long long i = 1 ; i < MAX ; ++i ){
        sum[ i ] = ( i * ( i + 1 ) )/2LL;
    }
    int t, idx;
    scanf("%d" , &t );
    long long val;
    while( t-- ){
        scanf("%lld" , &val );
        idx = lower_bound( sum , sum + MAX , val ) - sum;
        printf("%lld\n" , val - sum[ idx - 1 ] );
    }
    return 0;
}
