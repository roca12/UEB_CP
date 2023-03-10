#include<bits/stdc++.h>
#include<cstdlib>
#include<algorithm>
#define x first
#define y second
#define all(x) x.begin(),x.end()
#define sz(A) (int)(A.size())
#define forn(i, n) for(int i = 0; i < int(n); i++)
#define ld __float128
#define me(a, x) memset(a, x, sizeof(a))

using namespace std;
using i64 = uint64_t;
using ll = long long;
using ull = unsigned long long int;
using db = long double;
using str = string;


typedef pair<ll, ll> pi;
typedef std::numeric_limits< db > dbl;

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

bool isPrime(int n){
    int div = 0;
    for(int i=2;i<sqrt(n)+1;i++){
        if(n%i==0)return false;
    }
    return true;
}

ll solve(vector<pi>ans, int i, int j){
    if(i==sz(ans)) return 0;
    ll c =0;
    if(j - ans[i].x <= 14){
        c=ans[i].y;
    }
    return solve(ans, i+1, j)+c;
}

vector<pi> Prime(){
    vector<pi> ans;
    ans.push_back({2, 1});
    ans.push_back({3, 1});
    for(int i=4;i<=212;i++){
        if(isPrime(i)){
            ll total = solve(ans,0, i);
            ans.push_back({i, total});
        }
    }
    return ans;
}

int main() {
    //freopen("input.txt", "r", stdin);
    vector<pi> ans = Prime();
    vector<ll> primes;
    for(pi i:ans){
        primes.push_back(i.x);
    }
    ll x;cin>>x;
    auto idx = upper_bound(all(primes), x) - primes.begin();
    cout<<ans[idx-1].y<<'\n';
    return 0;
}
