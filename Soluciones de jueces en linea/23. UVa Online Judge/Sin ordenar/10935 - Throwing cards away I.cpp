/*****************************************
 Throwing cards away I
 ***ID: 10935
 ***Juez: UVA
 ***Tipo: Queue
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int main(){
    int n, ini;
    bool first;
    while( scanf("%d" , &n ) , n ){
        printf("Discarded cards:");
        queue<int> Q;
        for( int i = 1 ; i <= n ; ++i ) Q.push( i );
        ini = 1;
        first = true;
        while( !Q.empty() && n > 1 ){
            if( first ) printf(" 1");
            else printf(", %d" , Q.front() );
            Q.pop();
            n--;
            Q.push( Q.front() );
            ini = Q.front();
            Q.pop();
            first = false;
        }
        printf("\nRemaining card: %d\n" , ini );
    }
    return 0;
}
