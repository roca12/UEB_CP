/*****************************************
 What is the Card?
 ***ID: 10646
 ***Juez: UVA
 ***Tipo: Ad hoc - Games
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

int main(){
    int t, aux, Y , X , top;
    scanf("%d" , &t );
    char s[ 3 ];
    for( int q = 1 ; q <= t ; ++q ){
        string deck[ 53 ];
        for( int i = 1 ; i <= 52 ; ++i ){
            scanf("%s" , &s );
            deck[ i ] = string( s );
        }
        aux = 3;
        top = 27;
        Y = 0;
        while( aux-- ){
            X = 10;
            if(  '0'<= deck[ top ][ 0 ] && deck[ top ][ 0 ] <= '9' ) X = deck[ top ][ 0 ] - '0';
            Y += X;
            top--;
            top -= ( 10 - X );
        }
        if( Y >= top ) Y = 27 + ( Y - top );
        printf("Case %d: %s\n" , q , deck[ Y ].c_str() );
    }

    return 0;
}
