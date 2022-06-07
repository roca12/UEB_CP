/*****************************************
 Y2K Accounting Bug
 ***ID: 10576
 ***Juez: UVA
 ***Tipo: Brute Force
 ******************************************/
#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

long long s ,d , maxi;
int main(){
    vector<int> v;
    while( scanf("%lld %lld" , &s , &d) != EOF ){
        maxi = -1;
        for( int i = 0 ; i < 1<<12 ; ++i ){
            for( int j = 0 ; j < 12 ; ++j ){
                if( i & ( 1<<j) ){
                    v.push_back( -d );
                }else
                    v.push_back( s );
            }

            int lose = 0;
            for( int j = 0 ; j < 12 ; ++j ){
                if( j + 4 < 12 ){
                    int sum = 0;
                    for( int k = 0 ; k < 5 ; ++k ){
                        sum += v[j + k];
                    }

                    if( sum < 0 )
                        lose++;
                }
            }

            if( lose == 8 ){
                int sum = 0;
                for( int j = 0 ; j < 12  ; ++j ){
                    sum += v[ j ];
                }

                if( maxi < sum ){
                    maxi = sum;
                }
            }

            v.clear();
        }
        if( maxi < 0 )
            puts("Deficit");
        else
            printf("%lld\n" , maxi );
    }

    return 0;
}
