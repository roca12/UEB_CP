/*****************************************
 Simple Addition
 ***ID: 10994
 ***Juez: UVA
 ***Tipo: Math , Summation
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

long long S( long long n ){
    return ( ( n + 1 ) * n )/2;
}

long long F( long long n ){
    long long ans =0;
    while( n > 9 ){
        ans += S( n % 10 ) + (n/10) * 45;
        n /= 10;
    }
    return ans + S( n );
}

int main(){
    long long a , b , rem , div , ans;
    while( scanf("%lld %lld" , &a , &b ) , a > -1 && b > -1 ){
        printf("%lld\n" , F( b ) - F( a - 1 ) );
    }
    return 0;
}
