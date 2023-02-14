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
    float a,b,c,d;
    while(true){
        cin>>a>>b>>c>>d;
        if(a==0){
            break;
        }
        float fatiga = (b * d)/100;
        float distance = 0;
        for(int i=1;;i++){
            distance += b;
            if(distance > a){
                cout<<"success on day "<<(i)<<endl;
                break;
            }
            distance -= c;
            if(distance < 0){
                cout<<"failure on day "<<(i)<<endl;
                break;
            }
            if(b>0){
                b -= fatiga;
            }
        }
    }
    return 0;
}
