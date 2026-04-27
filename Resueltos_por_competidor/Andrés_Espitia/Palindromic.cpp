#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int i=1; i<=t; i++){
        bool pal = false;
        string n;
        cin>>n;
        cout<<"Case "<<i<<": ";
        if(n.size()==1) cout<<"Yes";
        else{
            int pos1 = 0;
            int pos2 = n.size()-1;
            while(pos1<n.size()/2){
                if(n[pos1]==n[pos2]) pal = true;
                else{
                    pal = false;
                    break;
                }
                pos1++;
                pos2--;
            }
            if(pal) cout<<"Yes";
            else cout<<"No";
        }
        cout<<endl;
        
    }
}
