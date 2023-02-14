#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
#define endl '\n'
#define ll long long
#define pi pair<int, int>
#define f first
#define s second

const int mxn = 2001;
int n;
int a[mxn], b[mxn], dp[mxn];
int g[mxn][mxn];
vector<vector<int>> v;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	cin >> n;
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < i; j++){
			char c;
			cin >> c;
			g[j][i] = c & 1, g[i][j] = !g[j][i];
		}
		
		int x = v.size(), p = -1, y = -1, q = -1;
		for(int j = 0; j < v.size(); j++)
		for(int l = 0; l < v[j].size(); l++){
			if(x == v.size() && g[i][v[j][l]]) x = j, p = l;
			if(g[v[j][l]][i]) y = j, q = l;
		}
		
		if(x < y){
			rotate(v[x].begin(), v[x].begin() + p, v[x].end());
			rotate(v[y].begin(), v[y].begin() + (q + 1) % v[y].size(), v[y].end());
			for(int j = x + 1; j <= y; j++){
				v[x].insert(v[x].end(), v[j].begin(), v[j].end());
			}
			v.erase(v.begin() + x + 1, v.begin() + y + 1);
			v[x].push_back(i);
		}else if(x == y){
			y = 1;
			while(y < v[x].size() && (!g[v[x][y - 1]][i] || !g[i][v[x][y]])) y++;
			v[x].insert(v[x].begin() + y, i);
		}else{
			v.insert(v.begin() + x, vector<int>(1, i));
		}
	}
	
	for(int i = v.size() - 1; ~i; i--){
		dp[i] = v[i].size() + dp[i + 1];
		for(int j = 0; j < v[i].size(); j++) a[v[i][j]] = i, b[v[i][j]] = j;
	}
	
	for(int t = 0; t < n; t++){
		cout << dp[a[t]];
		for(int i = a[t], j = b[t]; i < v.size(); i++, j = 0)
		for(int l = 0; l < v[i].size(); l++){
			cout << " " << (v[i][(j + l) % v[i].size()] + 1);
		}
		cout << endl;
	}
	
	return 0;
}