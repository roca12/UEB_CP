#include <bits/stdc++.h>
using namespace std;

const int mod = 1e9 + 7;
int w, l;
set<int> ans;

void add(int g) {
	for (int i = 1; i * i <= g; i++) {
		if (g % i) continue;
		ans.insert(i);
		ans.insert(g / i);
	}
}

int main() {
	int _;
	scanf("%d", &_);
	while (_--) {
		scanf("%d%d", &w, &l);
		ans.clear();
		add(__gcd(w - 1, l - 1));
		add(__gcd(l, w - 2));
		add(__gcd(l - 2, w));
		if (l % 2 != w % 2) ans.insert(2);
		printf("%d ", (int)ans.size());
		string res="";
		for (auto x: ans) res+=x+" ";
		res.substr(0,res.size()-1);
		cout<<res;
		puts("");
	}
	return 0;
}
