/*****************************************
  Mr. Azad and His Son
 ***ID: 10490
 ***Juez: UVA
 ***Tipo: Primes
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

bool isPrime( long long n){
    long long i;
    if( n == 2 )
        return 1;

    if( n % 2 == 0)
        return 0;

    for( i = 3 ; i * i <= n; i += 2 )
        if( n % i == 0 )
            return 0;
    return 1;
}

int main(){
    int n;
    long long p;
    while( scanf("%d" , &n ) , n ){
        bool prime , perfect;
        prime = perfect = false;
        if( isPrime( ( 1LL<<n ) - 1 ) ) 
			printf("Perfect: %lld!\n" , ( ( 1LL<<( n - 1 ) ) * ( ( 1LL<<n ) - 1 ) ) );
        else if( isPrime( n ) ) puts("Given number is prime. But, NO perfect number is available.");
        else puts("Given number is NOT prime! NO perfect number is available.");
    }
    return 0;
}
