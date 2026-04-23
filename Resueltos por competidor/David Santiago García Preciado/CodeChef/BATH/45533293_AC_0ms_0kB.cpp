#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	int n;
	cin>>n;
	for(int i=0;i<n;i++){
		int x,y,z;
		cin>>x;
		cin>>y;
		z=x/(y*2);
		cout<<z<<endl;
		z=0;
	}
	return 0;
}