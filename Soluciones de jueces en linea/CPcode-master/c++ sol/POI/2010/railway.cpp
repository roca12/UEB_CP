#include <iostream>
#include <cstdio>
#include <algorithm>
#include <array>
#include <deque>
#include <stack>
using namespace std;
#define endl '\n'
#define ll long long
#define pi pair<int, int>
#define f first
#define s second

typedef array<deque<int>, 2> T;

const int mxn = 200001;
ll n;
ll a[mxn], l[mxn], r[mxn], vis[mxn], par[mxn], rnk[mxn];
stack<T> stk;
 
inline ll f(int x){
	return stk.top()[x].empty() ? n * n + 1 : r[stk.top()[x].front()];
}

int fnd(int x){
	return x == par[x] ? x : par[x] = fnd(par[x]);
}

void unf(int x, int y){
	x = fnd(x), y = fnd(y);
	if(x == y) return;
	if(rnk[x] < rnk[y]) swap(x, y);
	rnk[x] += rnk[x] == rnk[y];
	par[y] = x;;
}

void edg(int x, int y){
	unf(x, y + n), unf(x + n, y);
}

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	cin >> n;
	
	for(int i = 0, x; i < n; i++) cin >> x, a[--x] = i;
	
	for(ll i = 0, j = 0; i < n; i++){
		j = max(j, a[i]);
		l[a[i]] = a[i] * n, r[a[i]] = j * n + i;
		par[i] = i, par[i + n] = i + n;
	}
	
	l[n] = r[n] = n * n;
	for(int i = 0; i <= n; i++){
		while(!stk.empty()){
			for(int j = 0; j < 2; j++){
				while(f(j) < l[i]) stk.top()[j].pop_front();
			}
			if(f(0) > f(1)) swap(stk.top()[0], stk.top()[1]);
			if(!stk.top()[0].empty()) break;
			stk.pop();
		}
		if(stk.empty() || r[i] < f(0)){
			stk.push(T());
			stk.top()[0].push_front(i);
		}else{
			while(stk.size() > 1 && stk.top()[1].empty()){
				T x;
				swap(stk.top(), x);
				stk.pop();
				if(r[i] < f(0)){
					stk.push(T());
					swap(stk.top(), x);
					break;
				}
				edg(i, x[0].front());
				edg(i, stk.top()[0].front());
				if(x[0].size() < stk.top()[0].size()){
					while(!x[0].empty()){
						stk.top()[0].push_front(x[0].back());
						x[0].pop_back();
					}
				}else{
					swap(x[0], stk.top()[0]);
					while(!x[0].empty()){
						stk.top()[0].push_back(x[0].front());
						x[0].pop_front();
					}
				}
			}
			if(r[i] > f(1)){
				cout << "NIE" << endl;
				return 0;
			}
			stk.top()[1].push_front(i);
			edg(i, stk.top()[0].front());
		}
	}
	
	cout << "TAK" << endl;
	
	for(int i = 0; i < n; i++){
		if(vis[fnd(i + n)]) cout << 2;
		else cout << 1, vis[fnd(i)] = 1;
		if(i < n - 1) cout << " ";
	}
	cout << endl;

	return 0;
}