/*****************************************
 A DP Problem
 ***ID: 1200
 ***Juez: UVA
 ***Tipo: String Manipulation
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define MAX 260
char s[ MAX ];
int ten[] = { 1 , 10 , 100 , 1000 , 10000 };
int main(){
    double ans;
    int resp;
    char ant;
    int t , xl , xr, sl , sr , i , j , num , k , len;
    scanf("%d" , &t );
    while( t-- > 0 && scanf("%s" , &s ) ){
        xl = xr = sl = sr = 0;
        len = strlen( s );
        s[ len++ ] = '='; s[ len ] = '\0';
        for( i = 0 ; s[ i ] ; ++i ){
            if( s[ i ] == 'x' ){
                j = i - 1;
                num = 0;
                k = 0;
                while( j >= 0 && s[ j ] >= '0' && s[ j ] <= '9' ) num += ten[ k++ ] * ( s[ j-- ] - '0' );
                if( num == 0 ){
                    if( j < 0 || s[ j ] =='+'  ) xl++;
                    else xl--;
                }else if( s[ j ] == '-') xl -= num;
                else xl += num;
            }
            if( s[ i ] == '+' || s[ i ] == '-' || s[ i ] == '=' ){
                j = i - 1;
                if( s[ j ] == 'x' ){ if( s[ i ] == '=' ){ i++; break; } else continue;}
                num = 0;
                k = 0;
                while( j >= 0 && s[ j ] >= '0' && s[ j ] <= '9' ) num += ten[ k++ ] * ( s[ j-- ] - '0' );
                if( num == 0 ) sl += num;
                else{
                    if( s[ j ] == '-' ) sl -= num;
                    else sl  += num;
                }
                if( s[ i ] == '=' ){ i++; break;}
            }
        }
        for( ; s[ i ] ; ++i ){
            if( s[ i ] == 'x' ){
                j = i - 1;
                num = 0;
                k = 0;
                while( j >= 0 && s[ j ] >= '0' && s[ j ] <= '9' ) num += ten[ k++ ] * ( s[ j-- ] - '0' );
                if( num == 0 ){
                    if( s[ j ] == '=' || s[ j ] =='+'  ) xr++;
                    else xr--;
                }else if( s[ j ] == '-' ) xr -= num;
                else xr += num;
            }
            if( s[ i ] == '+' || s[ i ] == '-' || s[ i ] == '=' ){
                j = i - 1;
                if( s[ j ] == 'x' ){ if( s[ i ] == '=' ){ i++; break; } else continue;}
                num = 0;
                k = 0;
                while( j >= 0 && s[ j ] >= '0' && s[ j ] <= '9' ) num += ten[ k++ ] * ( s[ j-- ] - '0' );
                if( num == 0 ) sr += num;
                else{
                    if( s[ j ] == '-' ) sr-= num;
                    else sr += num;
                }
            }
        }

        if( xl != xr ){
            xl -= xr;
            sr -= sl;
            ans = sr/(double)xl;
            if( ans < 0 ) resp = (int)ans - 1;
            else resp = (int) ans;
            printf("%d\n" , resp );
        }
        else if( xl == xr && sl == sr ) puts("IDENTITY");
        else puts("IMPOSSIBLE");
    }
    return 0;
}
