#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	int n;
	while(true){
		cin>>n;
		if(n<0) break;
		cout<<n*(n+1)/2 +1<<endl;
	}
	return 0;
}

