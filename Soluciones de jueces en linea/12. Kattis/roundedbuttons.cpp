// Michael Pfeifer
// Version 02, 2018/01/17

#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>

using namespace std;
using namespace __gnu_pbds;

typedef long long ll;
typedef long double ld;
typedef unsigned int uint;
typedef unsigned long long ull;

const ld  pi   = 4.0*atanl(1.0);
const int iinf = 1e9 + 10;
const ll  inf  = 1e18 + 10;
const int mod  = 1000000007;

#define enld endl
#define endl '\n'
#define pb push_back
#define debug(x) cout<<#x<<" -> "<<x<<'\n'
#define all(x) (x).begin(), (x).end()
#define rall(x) (x).rbegin(), (x).rend()
#define uni(x) (x).erase(unique(all(x)), (x).end())
#define rep(i, n) for (ll i = 0; i < (ll)(n); ++i)
#define rep1(i, n) for (ll i = 1; i <= (ll)(n); ++i)
#define umap unordered_map
#define uset unordered_set

template<class TIn>
using indexed_set = tree<
        TIn, null_type, less<TIn>,
        rb_tree_tag, tree_order_statistics_node_update>;

void fast() {
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
}

void file() {
    auto a = freopen("a.in",  "r", stdin);
    auto b = freopen("a.out", "w", stdout);
    if(!a || !b) cout << "uh oh" << endl;
}

ll readint(){
    char r;
    bool start=false,neg=false;
    ll ret=0;
    while(true){
        r=getchar();
        if((r-'0'<0 || r-'0'>9) && r!='-' && !start){
            continue;
        }
        if((r-'0'<0 || r-'0'>9) && r!='-' && start){
            break;
        }
        if(start)ret*=10;
        start=true;
        if(r=='-')neg=true;
        else ret+=r-'0';
    }
    if(!neg) return ret;
    else return -ret;
}





struct point {
    double x, y;
};

double dist(point& p1, point& p2) {
    return sqrt(pow(p1.x-p2.x,2) + pow(p1.y-p2.y,2));
}

int main() {
    //file();
    fast();

    int n;
    point corners[4];
    double x, y, w, h, r;
    int q;
    bool works;

    cin >> n;
    cin.ignore();

    while(n--) {
        cin >> x >> y >> w >> h >> r;

        corners[0] = {x+r,y+r};
        corners[1] = {x+r,y+h-r};
        corners[2] = {x+w-r,y+r};
        corners[3] = {x+w-r,y+h-r};

        cin >> q;
        while(q--) {
            point p;
            cin >> p.x >> p.y;

            works = false;

            if(p.x <= x+w-r && p.x >= x+r && p.y <= y+h && p.y >= y) {
                works = true;
            }
            if(p.x <= x+w && p.x >= x && p.y <= y+h-r && p.y >= y+r) {
                works = true;
            }

            for(short i = 0; i < 4; i++) {
                if(works) {
                    break;
                }
                if(dist(p, corners[i]) <= r) {
                    works = true;
                }

            }

            if(works) {
                cout << "inside" << endl;
            }
            else {
                cout << "outside" << endl;
            }
        }

        cout << endl;
    }

}
