/*****************************************
 The Party , Part 1
 ***ID: 10959
 ***Juez: UVA
 ***Tipo: Graph Theory, BFS
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
#define MAX 1005
vector<int> ady[ MAX ];
int dist[ MAX ];

void bfs( int x ){
    memset( dist , -1 , sizeof( dist ) );
    queue<int> Q;
    Q.push( x );
    dist[ x ] = 0;
    while( !Q.empty() ){
        int u = Q.front(); Q.pop();

        for( int v = 0 ; v < ady[ u ].size(); ++v ){
            int w = ady[ u ][ v ];
            if( dist[ w ] == -1 ){
                dist[ w ] = dist[ u ] + 1;
                Q.push( w );
            }
        }
    }
}

int main(){

    int t ,V ,E , u , v;
    scanf("%d", &t);

    for( int q = 0 ; q < t ; ++q ){
        if( q )putchar('\n');
        scanf("%d %d", &V , &E);

        while( E-- ){
            scanf("%d %d", &u ,&v );
            ady[ u ].push_back( v );
            ady[ v ].push_back( u );
        }
        bfs( 0 );

        for( int i = 1 ; i < V ; ++i ){
            printf("%d\n", dist[ i ] );
        }
        for( int i = 0 ; i < V ; ++i ){
            ady[ i ].clear();
        }
    }

    return 0;
}
