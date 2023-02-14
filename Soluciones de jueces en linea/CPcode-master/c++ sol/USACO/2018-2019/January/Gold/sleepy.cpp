#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;
#define endl '\n'

struct segTree{
	int l, r;
	segTree *left, *right;
	int sum = 0;

	segTree(int a, int b){
		l = a;
		r = b;

		if(l != r){
			int mid = (l + r) / 2;
			left = new segTree(l, mid);
			right = new segTree(mid + 1, r);
			
		}
	}
	
	void add(int index, int val){
		if(l > index || r < index) return;
		if(l == r){
			sum += val;
			return;
		}
		
		left->add(index, val);
		right->add(index,val);
		
		sum = left->sum + right->sum;
	}
	
	int getsum(int a, int b){
		if(l > b || r < a) return 0;
		if(l >= a && r <= b) return sum;
		
		return left->getsum(a, b) + right->getsum(a, b);
	}
};

int main(){
	freopen("sleepy.in", "r", stdin);
	freopen("sleepy.out", "w", stdout);
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	
	int n;
	cin >> n;
	
	int a[n];
	for(int i = 0; i < n; i++) cin >> a[i];
	
	segTree *order = new segTree(1, n);
	
	int cnt = n - 1;
	
	for(int last = n + 1; cnt >= 0; cnt--){
		if(a[cnt] < last){
			order->add(a[cnt], 1);
			last = a[cnt];
		}else{
			break;
		}
	}
	
	cnt++;
	
	cout << cnt << endl;
	
	for(int i = 0; i < cnt; i++){
		cout << (cnt - i - 1 + order->getsum(1, a[i]));
		
		order->add(a[i], 1);
		
		if(i < cnt - 1) cout << " ";
		else cout << endl;
	}

	return 0;
}