#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	int n, t, x, k, y;
	cin>>t;
	for(int i=0;i<t;i++){
		cin>>n;
		cin>>x;
		cin>>k;
		y=k/x;
		if(y>n) cout<<n<<endl;
		else cout<<y<<endl;
	}
	return 0;
}