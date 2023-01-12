#include<bits/stdc++.h>
#include<cstdlib>
#define x first
#define y second
#define all(x) x.begin(),x.end()
#define sz(x) x.size()
#define forn(i, n) for(int i = 0; i < int(n); i++)
#define ld __float128
#define me(a, x) memset(a, x, sizeof(a))

using namespace std;

typedef long long int ll;
typedef pair<ll, ll> pll;

template <class A, class B> ostream& operator << (ostream& out, const pair<A, B> &a) {
	return out << "(" << a.x << ", " << a.y << ")";
}
template <class A> ostream& operator << (ostream& out, const vector<A> &v) {
	out << "[";
	forn(i, sz(v)) {
		if(i) out << ", ";
		out << v[i];
	}
	return out << "]";
}

const ld PI = acos(-1.0);

map<ll, ll>memo;

ll divisors(ll n){
    ll _count = 1;
    map<ll ,ll>::iterator it = memo.find(n);
    if(it != memo.end()){
        return memo.find(n)->second;
    }
    ll _sqrt = sqrt(n);
    for (ll i = 2; i <= _sqrt; i = (i == 2 ? 3 : i + 2)) {
        ll pow = 0;
        while (n % i == 0) {
            pow++;
            n /= i;
        }
        if (pow != 0) {
            _count *= pow + 1;
            _sqrt = sqrt(n);
        }
    }

    if (n != 1){
        _count *= 1 + 1;
    }
    return memo[n] = _count;
}

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    memo[1] = 1;
    memo[2] = 2;
    //freopen("input.txt", "r", stdin);
    int n;
    cin>>n;
    while(n--){
        ll a, b;
        cin>>a>>b;
        pll ans = {0, 0};
        for(ll i=a;i<=b;i++){
            ll div = divisors(i);
            if(ans.second < div){
                ans = {i, div};
            }
        }
        printf("Between %lld and %lld, %lld has a maximum of %lld divisors.\n",a, b, ans.first, ans.second);
    }
    return 0;
}
