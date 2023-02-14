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
    while(true){
        int n;cin>>n;
        if(!n)break;
        bool flag = false;
        pi pole[n];
        forn(i, n){
            pole[i]= {0,0};
        }
        forn(i, n){
            int a,b;cin>>a>>b;
            if(!flag){
                int index = i + b;
                if(index >= n || index < 0 || pole[index].x!=0){
                    flag =true;
                    continue;
                }
                pole[index] = {a, b};
            }
        }

        if(flag){
            cout<<"-1"<<endl;
        }else{
            cout<<pole[0].x;
            for(int i=1;i<n;i++){
                cout<<" "<<pole[i].x;
            }
            cout<<endl;
        }
    }
    return 0;
}
