/*****************************************
 Jolly Jumpers
 ***ID: 10038
 ***Juez: UVA
 ***Tipo: Ad hoc
 ******************************************/
#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 100005
bool seen[ MAX ];
int main(){
    int n , ant,x;
    while( scanf("%d" , &n ) != EOF ){
        memset( seen , 0 , sizeof( seen ) );
        scanf("%d" , &ant );
        for( int i = 1 ; i < n && scanf("%d" , &x ) ; ++i ){
            seen[ abs( x - ant ) ] = 1;
            ant = x;
        }
        bool correct = true;
        for( int i = 1 ; i <= n - 1 ; ++i ){
            if( !seen[ i ] ){
                correct = false;
                break;
            }
        }
        if( correct )
            puts("Jolly");
        else
            puts("Not jolly");
    }

    return 0;
}
