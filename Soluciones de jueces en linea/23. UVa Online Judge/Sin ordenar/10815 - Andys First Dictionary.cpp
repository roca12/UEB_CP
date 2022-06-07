/*****************************************
 Andy's First Dictionary
 ***ID:  10815
 ***Juez: UVA
 ***Tipo: Ad hoc, String
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

int main(){
    string s, str;
    vector<string> v;
    map<string , bool> mp;
    while( getline( cin , s ) ){
         str="";
         for( int i = 0 ; i < s.length(); ++i ){
             if( isalpha( s [ i ]) ) str+=tolower( s[ i ] );
             else str+=" ";
         }
         str+=" ";
         stringstream ss(str);
         while( ss>>s ){
             if( !mp[ s ]) v.push_back(s);
             mp[ s ] = true;
         }
    }

    sort(v.begin() , v.end() );
    for( int i = 0 ; i < v.size(); ++i ){
        cout<<v[i]<<endl;
    }
    return 0;
}
