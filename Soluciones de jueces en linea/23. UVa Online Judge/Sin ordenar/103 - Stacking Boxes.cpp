/*****************************************
 ***Problema: Stacking Boxes
 ***ID: 103
 ***Juez: UVA
 ***Tipo: Sorting, LIS
 ***Autor: Jhosimar George Arias Figueroa
 ******************************************/

#include <bits/stdc++.h>


using namespace std;
#define mp make_pair
#define pb push_back
#define pvi pair< vector< int > , int >
vector< pvi > v;
vector< int > :: iterator it;
int k;
int dp[ 35 ] , prev[ 35 ];
bool entra( int x , int y ){
    for( int i = 0 ; i < k ; ++i )
        if( v[ x ].first[ i ] >= v[ y ].first[ i ] ) return false;
    return true;
}

void print( int idx , int len ){
    if( prev[ idx ] == -1 || len <= 0 ){ printf("%d" , v[ idx ].second );return; }
    print( prev[ idx ] , len - 1 );
    printf(" %d" , v[ idx ].second );
}

int main(){

    int n ,x;

    while( scanf("%d %d" , &n , &k ) != EOF ){
        v.clear();
        vector< int > aux;
        for( int i = 0 ; i < n ; ++i ){
            aux.clear();
            for( int j = 0 ; j < k ; ++j ){
                scanf("%d" , &x );
                aux.push_back( x );
            }
            sort( aux.begin() , aux.end() );
            v.pb( mp( aux , i + 1 ) );
            dp[ i ] = 1;
            prev[ i ] = -1;
        }
        stable_sort( v.begin() , v.end() );
        for( int i = 0 ; i < n ; ++i ){
            for( int j = i + 1 ; j < n ; ++j ){
                if( entra( i , j ) ){ //si todos los elementos de la caja i entran en la caja j
                    if( dp[ j ] < dp[ i ] + 1 ){
                        dp[ j ] = dp[ i ] + 1;
                        prev[ j ] = i;
                    }
                }
            }
        }

        int maxi = 0, idx = 0;
        for( int i = 0 ; i < n ; ++i ){
            if( maxi <= dp[ i ] ){
                maxi = dp[ i ];
                idx = i;
            }
        }
        printf("%d\n" , maxi );
        print( idx , maxi );
        printf("\n");
    }

    return 0;
}
