/*****************************************
 WordFish
 ***ID: 1209
 ***Juez: UVA
 ***Tipo: Permutation
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 25
char s[ MAX ], aux[ MAX ], ans[ MAX ];
int main(){
    int n, res , mini , maxi;
    while( scanf("%s" , &s ) != EOF ){
        n = strlen( s );
        strcpy( aux , s );
        maxi = 0;
        res = 0;
        for( int i = 0 ; i < 10 ; ++i ){
            prev_permutation( aux , aux + n );
            mini = 1<<30;
            for( int j = 0 ; j < n - 1 ; ++j ){
                mini = min( mini , abs( aux[ j ] - aux[ j + 1 ] ) );
            }
            if( mini >= maxi ){
                maxi = mini;
                res = i;
                strcpy( ans , aux );
            }
        }
        for( int i = 0 ; i < 11; ++i ){
            mini = 1<<30;
            for( int j = 0 ; j < n - 1 ; ++j ){
                mini = min( mini , abs( s[ j ] - s[ j + 1 ] ) );
            }
            if( mini > maxi ){
                maxi = mini;
                strcpy( ans , s );
            }
            next_permutation( s , s + n );
        }
        printf("%s%d\n" , ans , maxi );
    }

    return 0;
}
