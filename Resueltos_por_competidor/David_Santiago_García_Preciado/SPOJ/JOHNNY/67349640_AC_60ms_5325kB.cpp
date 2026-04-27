#include <bits/stdc++.h>
using namespace std;

int main()
{
    int cas = 0;
    int cont = 1;
    int left = 0;
    int right = 0;
    int len = 0;
    
    cin>>cas;
    
    for (int i = 0; i < cas; i++) {
		cin>>len;
		if(left<right) {
			cout<<cont<<endl;
		}
		right += len;
		cont++;
	}
}