# include <bits/stdc++.h>

 # define MAX 1005
 using namespace std ;

 int padre [ MAX ];


 struct Edge {
     int origen , destino;
     char color;
 };

void makeSet (int n ) {
    for ( int i = 0; i <= n ; i ++) padre [ i ] = i ;
}

int find ( int x ) {
    return ( x == padre [ x ] ? x : ( padre [ x ] = find ( padre [ x ]) ) ) ;
}

void Union (int x , int y ) {
    int raizX = find ( x ) ;
    int raizY = find ( y ) ;
    if ( raizX != raizY ) padre [ raizX ] = raizY ;
}

bool sameComponent ( int x , int y ) {
    return find ( x ) == find ( y ) ;
}

vector <Edge> vec ;

int KruskalMST (int V , bool flag) {
    int total = 0;
    makeSet ( V ) ;
    auto cmp = [&](const Edge& a, const Edge& b) {
        if (a.color == b.color) return false;
        return flag ? (a.color == 'B') : (a.color == 'R');
    };
    sort (vec.begin() , vec . end () , cmp) ;
    for ( int i = 0; i < vec . size () ; i ++) {
        if (!sameComponent ( vec [ i ]. origen , vec [ i ]. destino ) ) {
            if (vec[i].color == 'B') total++;
            Union ( vec [ i ]. origen , vec [ i ]. destino ) ;
        }
    }

    return total;
}

int main() {
    int n, m, k;
    cin >> n >> m >> k;

    vec.resize(m);
    for (int i = 0; i < m; i++) {
        cin >> vec[i].color >> vec[i].origen >> vec[i].destino;
    }

    int maxBlue = KruskalMST(n, true);
    int minBlue = KruskalMST(n, false);

    cout << (minBlue <= k && k <= maxBlue ? 1 : 0) << "\n";
    return 0;
}