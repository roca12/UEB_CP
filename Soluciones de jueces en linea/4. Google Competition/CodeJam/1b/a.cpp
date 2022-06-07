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





struct num {
    int peopleinit;
    int peopleneeded;
    int diff;
};

bool cmp(num& n1, num& n2) {
    return n1.diff < n2.diff;
}

set<ll> getroundups(ll n) {
    set<ll> ans;
    for(ll i = 0; i <= 2 * n; i++) {
        ld percent = ld(i) / n * 100;
        percent = fmod(percent, 1);
        if(percent >= .49999) {
            ans.insert(i);
        }
    }
    return ans;
}

ll getpercent(ll total, ll i) {
    ld percent = ld(i) / total;
    percent *= 100;
    percent += .50001;
    //debug(percent);
    return ll(percent);
}

void solve() {
    ll n, l;
    cin >> n >> l;

    set<ll> s = getroundups(n);

    vector<num> ct(l);
    for(ll i = 0; i < l; i++) {
        cin >> ct[i].peopleinit;
    }

    ll leftover = n;
    for(int i = 0; i < l; i++) {
        leftover -= ct[i].peopleinit;
    }

    if(s.size() == 0) {
        ll ans = 0;
        for(auto& i : ct) {
            ans += getpercent(n,i.peopleinit);
        }
        ans += getpercent(n,leftover);
        cout << ans << endl;
        return;
    }

    for(ll i = 0; i < l; i++) {
        auto it = s.lower_bound(ct[i].peopleinit);
        if(it == s.end()) {
            ct[i].diff = 10000000;
        }
        else {
            ct[i].peopleneeded = *s.lower_bound(ct[i].peopleinit);
            ct[i].diff = ct[i].peopleneeded - ct[i].peopleinit;
        }
    }

    sort(all(ct), cmp);

    ll costextra = *s.lower_bound(1);
    ll percentextra = getpercent(n, costextra);

    ll ans = 0;
    for(int i = 0; i < l; i++) {
        if(ct[i].diff <= costextra && ct[i].diff <= leftover) {
            leftover -= ct[i].diff;
            ans += getpercent(n, ct[i].peopleneeded);
            //cout << "Adding1 " << getpercent(n, ct[i].peopleneeded) << endl;
        }
        else {
            ans += getpercent(n, ct[i].peopleinit);
            //cout << "Adding2 " << getpercent(n, ct[i].peopleinit) << endl;
        }
    }

    while(leftover >= costextra) {
        leftover -= costextra;
        ans += percentextra;
            //cout << "Adding3 " << percentextra << endl;
    }

    ans += getpercent(n, leftover);

    cout << ans << endl;
}

int main() {
    //file();
    //fast();

    int cases;
    cin >> cases;
    for(int i = 1; i <= cases; i++) {
        cout << "Case #" << i << ": ";
        solve();
    }

    return 0;
}
