/*****************************************
  My Dear Neighbours
 ***ID: 10928
 ***Juez: UVA
 ***Tipo: Ad hoc, Graph(grado de nodo)
 ******************************************/

#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
#define INF 1<<20
int Int(string s){
    int n;
    stringstream ss( s );
    ss>>n;
    return n;
}

int main(){
    int t , p, min, index;
    cin>>t;
    string line;

    while( t-- ){
        cin>>p;
        int ady[ p + 1 ];

        for( int i = 1 ; i <= p ; ++i )ady[i] = 0;
        getline( cin , line );
        for( int i = 1; i <= p ; ++i ){
            getline( cin , line );
            line += " ";
            stringstream ss( line );
            while( ss>>line ){
                ady[ i ]++;
            }

        }
        min = INF;
        index = 1;
        for( int i = 1 ; i <= p ; ++i ){
            if( min > ady[ i ] ){
               min = ady[i];
               index = i;
            }
        }

        cout<<index;

        for( int i = 1 ; i <= p ; ++i ){
           if( i != index && ady [ i ] == min )cout<<" "<<i;
        }
        cout<<endl;
    }

    return 0;
}
