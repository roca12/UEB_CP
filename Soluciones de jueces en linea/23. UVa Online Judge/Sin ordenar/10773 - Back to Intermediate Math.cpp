/*****************************************
  Back to Intermediate Math
 ***ID: 10773
 ***Juez: UVA
 ***Tipo: Math
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int main(){
    int t , q , i;
    double ans , u , v , d;
    scanf("%d" , &t );
    for( q = 1 ; q <= t && scanf("%lf %lf %lf" , &d , &v , &u ) ; ++q ){
        printf("Case %d: " , q );
        if( u == 0 || u <= v || v == 0 ) puts("can't determine");
        else printf("%.3lf\n" , fabs( ( d/u ) - ( d/ sqrt( u * u - v * v ) ) ) );
    }
    return 0;
}
