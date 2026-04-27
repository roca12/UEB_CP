#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	int n;
	cin>>n;
	for(int i=0;i<n;i++){
		int x,y,z,w;
		cin>>x;
		cin>>y;
		cin>>z;
		w=z-(y/x);
		if(w<0) w=0;
		cout<<w<<endl;
		w=0;
	}
	return 0;
}