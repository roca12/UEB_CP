#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	int t;
	cin>>t;
	for(int i =0;i<t;i++){
		int a,b;
		cin>>a;
		cin>>b;
		cout<<(a / 3) * (b / 3)<<endl;
	}
	return 0;
}

