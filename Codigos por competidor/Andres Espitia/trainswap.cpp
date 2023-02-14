#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int train[n];
        for(int i=0; i<n; i++) cin>>train[i];
        int cont = 0;
        for(int i=0; i<n; i++){
            for(int j = n-1; j > i; j--) {
				if(train[j] < train[j-1]) {
					int aux = train[j];
					train[j] = train[j-1];
					train[j-1] = aux;
					cont++;
				}
			}
        }
        cout<<"Optimal train swapping takes "<<cont<<" swaps."<<endl;
    }
}
