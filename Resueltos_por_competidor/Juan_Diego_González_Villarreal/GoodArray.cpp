#include<bits/stdc++.h>
typedef long long ll;
#define DBG(X) cerr<<#X<<": "<<(X)<<endl;
using namespace std;
int main(){
	int n, cnt = 0;
	cin>>n;
	vector<ll> v(n);
	ll r1=-1,r2=-1,tmp,total = 0;
	for(ll &x: v){
		cin>>x;
		total+=x;
		if(x>r1){
			r2=r1;
			r1=x;
		}else if(x>r2){
			r2 = x;
		}
	}
	//DBG(r1);
	//DBG(r2);
	string ans;
	for(int i = 0; i<n; i++){
		if(v[i]==r1){
			tmp = total - r2 - v[i];
			if(tmp==r2){
				ans += to_string(i+1)+" ";
				cnt++;
			}
		}else{
			tmp = total - r1 - v[i];
			if(tmp==r1){
				ans += to_string(i+1)+" ";
				cnt++;
			}
		}
	}
	cout<<cnt<<endl<<ans;
}
