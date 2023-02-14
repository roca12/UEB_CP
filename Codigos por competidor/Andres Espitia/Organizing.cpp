#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	int t = 0;
	cin>>t;
	while(t--){
		int n = 0;
		cin>>n;
		int a[10];
		for(int i=0; i<10; i++){
			a[i] = 0;
		}
		while(n--){
			int d, b;
			cin>>b>>d;
			if(a[d-1]<=b) a[d-1] = b;
		}
		int imp = 0;
		for(int i=0; i<10; i++){
			if(a[i] == 0){
				imp = 0;
				cout<<"MOREPROBLEMS"<<endl;
				break;
			}else{
				imp += a[i];
			}
		}
		if(imp != 0) cout<<imp<<endl;
	}
	return 0;
}

