/***********************************************
 Generating Fast Sorted Permutation
 ***ID: 10098
 ***Juez: UVA
 ***Tipo: Ad hoc, next_permutation
 **********************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int main(){

    int t;
    scanf("%d", &t );
    char ss[ 20 ];
    for( int i = 0 ; i < t ; ++i ){
        scanf("%s" , ss );
        string s(ss);
        sort( s.begin() , s.end() );
        do{
            printf("%s\n", s.c_str());
        }while( next_permutation( s.begin() , s.end() ) );
        printf("\n");
    }

    return 0;
}
