/*****************************************
 ***Problema: Dollars
 ***ID: 147
 ***Juez: UVA
 ***Tipo: DP, Coin Change
 ***Autor: Jhosimar George Arias Figueroa
 ******************************************/

#include <bits/stdc++.h>


using namespace std;
#define MAX 6005
int a[ 11 ] = { 1,  2 , 4 , 10 , 20 , 40 , 100 , 200 , 400 , 1000 , 2000 };
long long dp[ MAX ];
void CoinChange(){
    dp[ 0 ] = 1;
    for( int i = 0 ; i < 11 ; ++i ){
        for( int j = a[ i ] ; j < MAX ; ++j ){
            dp[ j ] = dp[ j ] + dp[ j - a[ i ] ];
        }
    }
}
int main(){
    double n;
    CoinChange();
    while( scanf("%lf" , &n ) && n != 0 ){
        printf("%6.2lf%17lld\n" , n , dp[ (int)( n * 20 ) ] );
    }

    return 0;
}
