// Michael Pfeifer
// Version 04, 2018/02/17

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
const ld  prec = .000001;

#define enld endl
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





int fillblock(set<pair<int,int>>& s, int x, int y) {
    int trues = 0;
    for(int i = -1; i <= 1; i++) {
        for(int j = -1; j <= 1; j++) {
            if(s.count({i,j}) > 0) {
                trues++;
            }
        }
    }

    int tries = 0;
    while(trues < 9) {
        tries++;

        cout << x << " " << y << endl;
        cerr << "Guessing " <<  x << " " << y << endl;
        int t1, t2;
        cin >> t1 >> t2;
        if(t1 == 0 && t2 == 0) {
            return 0;
        }
        if(t1 == -1 && t2 == -1) {
            return 1;
        }

        if(s.count({t1,t2}) == 0) {
            s.insert({t1,t2});
            trues++;
        }
    }

    return 2;
}

int solve() {
    int a;
    cin >> a;

    int size = sqrt(a) + 1;
    cout << "4 4" << endl;
    int x, y;
    cin >> x >> y;

    set<pair<int,int>> s;
    s.insert({x,y});

    for(int i = 1; i < 1000; i++) {
        int ret = fillblock(s,x+i,y);
        if(ret != 2) {
            return ret;
        }
    }

    return 1;
}

int main() {
    //file();
    //fast();

    int t;
    cin >> t;
    while(t--) {
        int ret = solve();
        if(ret == 1) {
            break;
        }
    }

    return 0;
}
