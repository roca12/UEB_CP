/*
 * Autor: Juan Martinez
 * Problema: Lumberjack Sequencing
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/UVA-11942
 */
#include <bits/stdc++.h>
using namespace std;
#define ln "\n"

int main() {
	int t; cin>>t;
    cout<<"Lumberjacks:"<<ln;
    while(t--) { 
        vector<int> arr(10), arr2(10), arr3(10);
        for(int i = 0; i < 10; i++) {
            cin>>arr[i]; arr2[i] = arr[i]; arr3[i] = arr2[i];
        }
        sort(arr2.begin(), arr2.end());
        sort(arr3.begin(), arr3.end(), greater<int>());
        bool b = 1;
        for(int i = 0; i < 10; i++) {
            if(arr[i] != arr2[i]) {
                b = 0;
                break;
            }
        }
        if(!b) {
            b = 1;
            for(int i = 0; i < 10; i++) {
                if(arr[i] != arr3[i]) {
                    //cout<<arr[i]<<" "<<arr3[i]<<ln;
                    b = 0;
                    break;
                }
            }
        }
        if(b) cout<<"Ordered"<<ln;
        else cout<<"Unordered"<<ln;
    }
}
