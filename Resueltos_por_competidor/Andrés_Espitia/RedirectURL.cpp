#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int x=1; x<=t; x++){
        string url;
        cin>>url;
        cout<<"Case "<<x<<": ";
        if(url[4]=='s'){
            cout<<url;
        }
        else{
            url=url+url[url.size()-1];
            for(int i=url.size()-1; i>=4; i--){
                url[i] = url[i-1];
            }
            url[4]='s';
            cout<<url;
        }
        cout<<endl;
    }
}
