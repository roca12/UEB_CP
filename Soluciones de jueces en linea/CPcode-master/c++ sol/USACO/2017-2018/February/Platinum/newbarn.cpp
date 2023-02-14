#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
#define endl '\n'
#define pi pair<int, int>

const int maxn = 100000, k = 18;
int n;
bool used[maxn];
pi query[maxn];
int par[k][maxn];
int par2[maxn], sz[maxn], d[maxn];
vector<int> rt;
vector<int> graph[maxn];
pi sol[maxn][2];
int m;

void precomp(){
	for(int i = 1; i < 18; i++){
		for(int j = 0; j < n; j++){
			par[i][j] = par[i - 1][j] == -1 ? -1 : par[i - 1][par[i - 1][j]];
		}
	}
}

void dfs(int c){
	for(int i : graph[c]){
		if(i != par[0][c]){
			d[i] = d[c] + 1;
			dfs(i);
		}
	}
}

int dfs1(int c, int p){
	sz[c] = 1;
	for(int i : graph[c]){
		if(i != p && !used[i]) sz[c] += dfs1(i, c);
	}
	return sz[c];
}

int dfs2(int c, int p){
	for(int i : graph[c]){
		if(i != p && !used[i] && 2 * sz[i] > sz[c]){
			sz[i] = sz[c];
			return dfs2(i, c);
		}
	}
	return c;
}

void recur(int x, int p){
	dfs1(x, -1);
	int c = dfs2(x, -1);
	par2[c] = p;
	used[c] = 1;
	
	for(int i : graph[c]){
		if(!used[i]) recur(i, c);
	}
}

int dist(int x, int y){
	int ret = d[x] + d[y];
	for(int i = k - 1; i >= 0; i--){
		if(par[i][x] != -1 && d[par[i][x]] >= d[y]) x = par[i][x];
		if(par[i][y] != -1 && d[par[i][y]] >= d[x]) y = par[i][y];
	}
	for(int i = k - 1; i >= 0; i--){
		if(par[i][x] != par[i][y]){
			x = par[i][x];
			y = par[i][y];
		}
	}
	ret -= 2 * d[(x == y ? x : par[0][x])];
	return ret;
}

void add(int x){
	int c = x, p = x;
	while(p != -1){
		pi ret = {dist(x, p), c};
		if(sol[p][0].second == c){
			sol[p][0] = max(sol[p][0], ret);
		}else{
			sol[p][1] = max(sol[p][1], ret);
		}
		
		if(sol[p][0] < sol[p][1]) swap(sol[p][0], sol[p][1]);
		
		c = p;
		p = par2[p];
	}
}

void qry(int x){
	int ans = 0;
	int c = x, p = x;
	
	while(p != -1){
		if(sol[p][0].second == c){
			if(sol[p][1].first != -1) ans = max(ans, dist(x, p) + sol[p][1].first);
		}else{
			if(sol[p][0].first != -1) ans = max(ans, dist(x, p) + sol[p][0].first);
		}
		
		c = p;
		p = par2[p];
	}
	
	cout << ans << endl;
}

int main(){
	freopen("newbarn.in", "r", stdin);
	freopen("newbarn.out", "w", stdout);
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	
	cin >> n;
	
	for(int i = 0; i < n; i++){
		char t;
		int x;
		cin >> t >> x;
		x--;
		
		query[i] = {(t == 'B'), (t == 'B' ? m : x)};
		
		if(query[i].first){
			par[0][m] = x;
			if(x != -2){
				graph[x].push_back(m);
				graph[m].push_back(x);
			} 
			else rt.push_back(m);
			m++;
		}
	}
	
	precomp();
	for(int i : rt){
		dfs(i);
        recur(i, -1);
	}
	
	for(int i = 0; i < m; i++) sol[i][0] = sol[i][1] = {-1, -1};
	
	for(int i = 0; i < n; i++){
		if(query[i].first){
			add(query[i].second);
		}else{
			qry(query[i].second);
		}
	}

	return 0;
}