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
typedef pair<ll, ll> pi;

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


int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    //freopen("input.txt", "r", stdin);
    ll a, b, cases = 1;
    while(true){
        cin>>a>>b;
        ll cont = 0;
        if(a<0 && b<0){
            break;
        }
        ll x = a;
        while(true){
            if(x==1){
                cont++;
                break;
            }
            if(x%2 == 0){
                x/=2;
            }else{
                x=(3*x)+1;
            }
            cont++;
            if(x>b){
                break;
            }
        }
        printf("Case %lld: A = %lld, limit = %lld, number of terms = %lld\n", cases,a,b,cont);
        cases++;
    }
    return 0;
}
