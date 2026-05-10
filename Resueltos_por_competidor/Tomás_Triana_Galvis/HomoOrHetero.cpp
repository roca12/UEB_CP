#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
/*
 * Autor: Tomás Triana Galvis
 * Problema: Homo or Hetero
 * Juez online: SPOJ HOMO
 * Veredicto: Accepted
 * Url:https://www.spoj.com/problems/HOMO/en/
 **/ 
int main()
{
    int t, i;
    set<int> s;
    vector<int> arr;
    string se;
    cin>>t;
    while(t--){
        cin>>se>>i;
        if(se == "insert"){
            arr.push_back(i);
            s.insert(i);
        }else{
            auto it = find(arr.begin(), arr.end(), i);
            if (it != arr.end()) {
                arr.erase(it);
            }
            auto temp = find(arr.begin(),arr.end(),i);
            if(temp == arr.end()){
                s.erase(i);
            }

        }
        if(arr.size() == 0 || arr.size() == 1){
            cout<<"neither"<<endl;
        }else if(s.size() == arr.size()){
            cout<<"hetero"<<endl;
        }else if(s.size() == 1){
            cout<<"homo"<<endl;
        }else if(s.size() < arr.size()){
            cout<<"both"<<endl;
        }

    }
    return 0;
}
