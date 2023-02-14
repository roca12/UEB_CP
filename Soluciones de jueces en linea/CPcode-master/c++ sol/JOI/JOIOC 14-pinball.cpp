/*
  Realize that the optimal sol will always have a set of boards' output points decreasing from the central position to left and a set
of boards' output positions increasing to the right, with the leftmost and rightmost boards touching the walls, and each board below 
with their end point containing the output position of the one above. Output points are montonic because there is no point in having
the output point going the opposite direction even if the board reaches out further if it doesn't hit the other end as the next board
will have to reach back even more far and go even more forward as well. This means we can just hold a dp map of the best output points 
on both the left and right side, and use lower bound to find the transitions based on the boards endpoints and see if we should
combine there while adding the new point to the dp maps, then make sure the maps maintain monotonicity of best points extending outward.
Complexity is O(nlgn).
*/

#include <iostream>
#include <cstdio>
#include <algorithm>
#include <map>
using namespace std;
#define endl '\n'
#define ll long long
#define pi pair<int, int>
#define f first
#define s second

const ll inf = 0x3f3f3f3f3f3f3f3f;
int n, m;
map<int, ll> dpl;
map<int, ll, greater<int>> dpr;

template<typename T>
void add(T &dp, int x, ll y){
	auto it = dp.insert({x, y}).f;
	y = min(y, it->s), it->s = y;
	if(next(it) != dp.end() && next(it)->s <= y) it = dp.erase(it);
	while(it != dp.begin() && (--it)->s >= y) it = dp.erase(it);
}

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	cin >> n >> m;
	
	ll ret = !!~-m * inf;
	dpl[1] = 0, dpl[m] = inf, dpr[1] = inf, dpr[m] = 0;
	for(int i = 0; i < n; i++){
		int l, r, x, y;
		cin >> l >> r >> x >> y;
		ll vl = dpl.lower_bound(l)->s, vr = dpr.lower_bound(r)->s;
		ret = min(ret, vl + vr + y);
		add(dpl, x, vl + y), add(dpr, x, vr + y);
	}
	
	cout << (ret < inf ? ret : -1) << endl;

	return 0;
}
