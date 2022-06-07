/*****************************************
 Funny Encryption Method
 ***ID: 10019
 ***Juez: UVA
 ***Tipo: Ad hoc , simulation
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int bitcount( int n ){
    int cnt = 0;
    while( n ){
        n = n & ( n - 1 );
        cnt++;
    }
    return cnt;
}
int pot( int a , int b ){
    int r = 1;
    for( int i = 1 ; i <= b ; ++i ) r *= a;
    return r;
}


int toBase10( string s , int base ){
    int resp = 0, dig;
    for( int i = s.length() - 1 , j = 0 ; i >= 0 ; --i, ++j ){
        if( '0' <= s[ i ] && s[ i ] <= '9' ) dig = s[ i ] - '0';
        else dig = ( s[ i ] - 'A' ) + 10;
        resp += dig * pot( base , j );
    }
    return resp;
}
string toStr( int n ){
    stringstream ss;
    ss<<n;
    string s;
    ss>>s;
    return s;
}

int main(){
    int n , t , b1 , b2;
    scanf("%d" , &t );
    while( t-- ){
        scanf("%d" , &n );
        b1 = bitcount( n );
        n = toBase10( toStr( n ) , 16 );
        b2 = bitcount( n );
        printf("%d %d\n" , b1 , b2 );

    }
    return 0;
}
