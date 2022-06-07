/*****************************************
Wine Trading in Gergovia
 ***ID: 11054
 ***Juez: UVA
 ***Tipo: Greedy
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
long long absll( long long n ){ return (n < 0 )?-n : n ;}
int main(){

    int n;
    long long x , aux , ant, resp;
    while( scanf("%d" , &n ) && n ){
        aux = 0;ant = 0;resp = 0;
        for( int i = 0 ; i < n ; ++i ){
            scanf("%lld", &x );
            if( i > 0 ){
                resp += absll( aux );
            }
            aux = aux + x;
        }
        printf("%lld\n" , resp );
    }

    return 0;
}
