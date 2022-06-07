/*****************************************
  Ignoring Digits
 ***ID: 10993
 ***Juez: UVA
 ***Tipo: BFS
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define D 10
int n , digits[ D ] , len;

struct Estado{
    string num;
    int residuo;
    Estado( string n , int res ): num( n ) , residuo( res ){}
};
#define MAX 100005
bool seen[ MAX ];
void bfs(){
    queue< Estado > Q;
    int i;
    memset( seen , 0 , sizeof( seen ) );
    for( i = 0 ; i < len ; ++i ){
        if( digits[ i ] ){
            string s = "";
            Q.push( Estado( s + (char)( digits[ i ] + '0') , digits[ i ] % n ) );
            seen[ digits[ i ] % n ] = 1;
        }
    }

    while( !Q.empty() ){
        Estado act = Q.front(); Q.pop();

        if( act.residuo == 0 ){
            printf("%s\n" , act.num.c_str() );
            return;
        }
        for( i = 0 ; i < len ; ++i ){
            int new_residuo = ( act.residuo * 10 + digits[ i ] ) % n;
            if( !seen[ new_residuo ] ){
                seen[ new_residuo ] = 1;
                Q.push( Estado( act.num + (char)( digits[ i ] + '0' ), new_residuo ) );
            }
        }
    }
    puts("impossible");
}

int main(){
    long long f;
    while( scanf("%lld %d" , &f , &n ) , f | n ){
        len = 0;
        while( f > 0 ){
            digits[ len++ ] = f % 10;
            f /= 10;
        }
        bfs();
    }
    return 0;
}
