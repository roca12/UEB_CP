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





struct cashier {
    int m;
    int s;
    int p;
};

int cashiertime(cashier& c, int time) {
    time -= c.p;
    if(time <= 0) {
        return 0;
    }
    int bits = time / c.s;
    return min(bits, c.m);
}

int getbits(vector<cashier>& cashiers, int robots, int time) {
    vector<int> bits;
    for(auto i : cashiers) {
        bits.pb(cashiertime(i, time));
    }

    sort(all(bits));
    reverse(all(bits));
    int total = 0;
    for(int i = 0; i < robots && i < bits.size(); i++) {
        total += bits[i];
    }
    return total;
}

void solve() {
    int r, b, c;
    cin >> r >> b >> c;

    vector<cashier> cashiers;
    for(int i = 0; i < c; i++) {
        cashier cash;
        cin >> cash.m >> cash.s >> cash.p;
        cashiers.pb(cash);
    }

    int lo = 0;
    int hi = iinf;
    while(hi - lo > 0) {
        int mi = (hi + lo) / 2;
        int bits = getbits(cashiers, r, mi);
        if(bits >= b) {
            hi = mi;
        }
        else {
            lo = mi + 1;
        }
    }

    cout << lo << endl;
}

int main() {
    //file();
    //fast();

    int cases;
    cin >>cases;
    for(int i = 1; i <= cases; i++) {
        cout << "Case #" << i << ": ";
        solve();
    }

    return 0;
}
