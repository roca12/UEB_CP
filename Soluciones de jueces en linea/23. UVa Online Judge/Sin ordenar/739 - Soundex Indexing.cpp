/*****************************************
 Soundex Indexing
 ***ID: 739
 ***Juez: UVA
 ***Tipo: Ad hoc
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int value[26] = {0 , 1 , 2 , 3 ,0 , 1 , 2 , 0 , 0 , 2 ,2 , 4 , 5, 5 , 0 , 1 , 2 , 6 , 2 , 3 , 0 , 1 , 0 , 2 , 0 , 2 };

int main(){


    char s[30];
    int l, ant, cont;

    printf("         NAME                     SOUNDEX CODE\n");
    while( scanf("%s", s) !=EOF){
        l = strlen( s );

        printf("         %s",s);

        for(int i = l ; i < 25  ;++i)putchar(' ');

        putchar(s[0]);

        cont = 1;
        ant = value[ s[0] - 'A'];
        for( int i = 1; i < l ; ++i ){
            if( ant != value[ s[i] - 'A' ] && value[ s[i]- 'A'] != 0){
               printf("%d",value [ s[i] - 'A'] );
               cont++;
            }
            ant = value[ s[i] - 'A' ];
            if( cont > 3)break;
        }
        for( int i = cont ; i < 4; ++i)putchar('0');

        putchar('\n');

    }
    printf("                   END OF OUTPUT\n");

    return 0;
}
