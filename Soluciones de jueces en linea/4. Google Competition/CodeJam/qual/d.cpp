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


ld CONV = M_PI/180;
ld REV = 180/M_PI;
ld SPEC = 1.414213;




bool enough1(ld target, ld angle) {
    ld val = sin(angle*CONV) + cos(angle*CONV);
    return val >= target;
}

void solve1(ld d) {
    ld lo = 0;
    ld hi = 45;

    while(hi - lo > prec) {
        ld mi = (hi + lo) / 2;
        if(enough1(d, mi)) {
            hi = mi;
        }
        else {
            lo = mi;
        }
    }

    ld angle = lo;

    ld diffx = .5*sin(angle*CONV);
    ld diffy = .5*cos(angle*CONV);

    cout << fixed;
    cout.precision(8);

    cout << .0 + diffx << " " << .0 + diffy << " 0" << endl;
    cout << .0 - diffy << " " << .0 + diffx << " 0" << endl;
    cout << "0 0 0.5" << endl;
}




struct point {
    ld x, y, z;
};

point calc(ld phi, ld theta) {
    point p;
    p.x = .5 * sin(phi*CONV) * cos(theta*CONV);
    p.y = .5 * sin(phi*CONV) * sin(theta*CONV);
    p.z = .5 * cos(phi*CONV);
    return p;
}

bool enough2(ld target, ld angle) {
    ld val = 3 * sin(angle*CONV) * SPEC;
    return val >= target;
}

void solve2(ld d) {
    ld lo = 0;
    ld hi = 45;

    while(hi - lo > prec) {
        ld mi = (hi + lo) / 2;
        if(enough2(d, mi)) {
            hi = mi;
        }
        else {
            lo = mi;
        }
    }

    ld angle = lo;

    cout << fixed;
    cout.precision(8);

    point p1 = calc(45, angle);
    point p2 = calc(135, angle);
    point p3 = calc(45, angle+90);

    cout << p1.x << " " << p1.y << " " << p1.z << endl;
    cout << p2.x << " " << p2.y << " " << p2.z << endl;
    cout << p3.x << " " << p3.y << " " << p3.z << endl;
}

int main() {
    //file();
    //fast();

    int cases;
    cin >> cases;
    for(int i = 0; i < cases; i++) {
        cout << "Case #" << i+1 << ":" << endl;

        ld d;
        cin >> d;

        if(d <= 1.414213+prec) {
            solve1(d);
        }
        else {
            solve2(d);
        }
    }

    return 0;
}
