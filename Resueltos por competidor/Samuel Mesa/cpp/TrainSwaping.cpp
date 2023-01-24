#include <bits/stdc++.h>
using namespace std;

int main(int argc, char *argv[]) {
	int casos,nums,cont,cambio;
	cin>>casos;
	for(int i=0;i<casos;i++){
		cin>>nums;
		int arr[nums];
		cont=0;
		for(int j=0;j<nums;j++){
			cin>>arr[j];
		}
		for(int k=0;k<nums;k++){
			for(int h =0;h<nums-1;h++){
                    if(arr[h]>arr[h+1]){
					cambio =arr[h];
					arr[h]=arr[h+1];
					arr[h+1]=cambio;
					cont++;
				}
			}
		}
		cout<<"Optimal train swapping takes "<<cont<<" swaps."<<endl;
	}
	
	return 0;
}

