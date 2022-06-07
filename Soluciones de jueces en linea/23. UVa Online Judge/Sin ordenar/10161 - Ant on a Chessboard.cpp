/*****************************************
 Ant on a Chessboard
 ***ID: 10161
 ***Juez: UVA
 ***Tipo: Recurrences
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int main(){
    long long n , pos , x , y;
    while( scanf("%lld" , &n ) , n ){
        pos = ( long long ) ceil( sqrt( n ) ) - 1;
        if( pos & 1 ){
            if( pos * pos + pos + 1 >= n ){
                y = pos + 1;
                x = n - pos * pos;
            }
            else{
                x = pos + 1;
                y = ( pos + 1 ) - ( n - ( pos * pos + pos + 1 ) );
            }
        }
        else{
            if( pos * pos + pos + 1 >= n ){
                x = pos + 1;
                y = n - pos * pos;
            }
            else{
                y = pos + 1;
                x = ( pos + 1 )- ( n - ( pos * pos + pos + 1 ) ) ;
            }
        }
        printf("%lld %lld\n" , x , y );
    }
    return 0;
}
