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





bool calc(string s, ll n) {
    ll total = 0;
    ll mul = 1;
    bool works = true;
    int shifted = 0;

    for(auto i : s) {
        if(i == 'C') {
            mul <<= 1;
            shifted++;
        }
        if(i == 'S') {
            total += mul;
            if(shifted > 32) {
                works = false;
            }
        }
    }


    if(total > n) {
        works = false;
    }

    return works;
}

void solve() {
    ll n;
    string s;
    cin >> n >> s;

    ll count = 0;
    bool works = false;

    if(calc(s, n)) {
        cout << 0 << endl;
        return;
    }

    for(int i = s.size()-1; i >= 0; i--) {
        if(s[i] == 'C') {
            for(int j = i+1; j < s.size(); j++) {
                if(s[j-1] == s[j]) {
                    break;
                }
                swap(s[j-1],s[j]);
                count++;
                if(calc(s, n)) {
                    works = true;
                    break;
                }
            }
        }
        if(works) {
            break;
        }
    }

    if(works) {
        cout << count << endl;
    }
    else {
        cout << "IMPOSSIBLE" << endl;
    }
}

int main() {
    //file();
    //fast();

    ll cases;
    cin >> cases;
    for(ll i = 1; i <= cases; i++) {
        cout << "Case #" << i << ": ";
        solve();
    }

    return 0;
}
