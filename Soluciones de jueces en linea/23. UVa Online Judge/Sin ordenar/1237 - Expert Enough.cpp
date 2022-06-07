/*****************************************
  Expert Enough?
 ***ID: 1237
 ***Juez: UVA
 ***Tipo: Ad hoc
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 10005
struct Node{
    string name;
    int L , R;
    Node(){}
}v[ MAX ];

int main(){
    int a[ MAX ];
    int t , n , Q , x, idx, cnt;
    scanf("%d" , &t );
    char name[ 25 ];
    string ans;
    for( int q = 0 ; q < t ; ++q ){
        if( q )putchar('\n');
        scanf("%d" , &n );
        for( int i = 0 ; i < n ; ++i ){
            scanf("%s %d %d" , &name , &v[ i ].L , &v[ i ].R );
            v[ i ].name = string( name );
        }
        scanf("%d" , &Q );
        while(  Q-- ){
            scanf("%d" , &x );
            cnt = 0;

            for( int i = 0 ; i < n ; ++i ){
                if( v[ i ].L <= x && x <= v[ i ].R ){ cnt++; ans = v[ i ].name;}
                if( cnt > 1 )break;
            }
            if( cnt == 1 ) printf("%s\n" , ans.c_str() );
            else puts("UNDETERMINED");
        }
    }
    return 0;
}
