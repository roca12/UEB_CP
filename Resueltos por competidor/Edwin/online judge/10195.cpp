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
double heron(double a,double b,double c,double s){
  return sqrt(s*(s-a)*(s-b)*(s-c));
}
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    //freopen("input.txt", "r", stdin);
    double a,b,c;
    while(cin>>a>>b>>c){
        double ans = 0.000;
        if(a!=0 && b!=0 && c!=0){
            double s = (a+b+c)/2;
            double area = heron(a,b,c,s);
            ans = area/s;
        }
        printf("The radius of the round table is: %.3f\n", ans);

    }
    return 0;
}
