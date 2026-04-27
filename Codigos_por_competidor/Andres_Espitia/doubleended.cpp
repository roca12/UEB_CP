#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int c=1; c<=t; c++){
        cout<<"Case "<<c<<": "<<endl;
        int n, m, x;
        deque<int> d;
        string p;
        cin>>n>>m;
        while(m--){
            cin>>p;
            if(p == "pushLeft"){
                if(d.size()>=n){
                    cin>>x;
                    cout<<"The queue is full"<<endl;
                }
                else{
                    cin>>x;
                    cout<<"Pushed in left: "<<x<<endl;
                    d.push_front(x);
                }
            }
            else if(p == "pushRight"){
                if(d.size()>=n){
                    cin>>x;
                    cout<<"The queue is full"<<endl;
                }
                else{
                    cin>>x;
                    cout<<"Pushed in right: "<<x<<endl;
                    d.push_back(x);
                }
            }
            else if(p == "popLeft"){
                if(d.size()==0){
                    cout<<"The queue is empty"<<endl;
                }
                else{
                    x=d.front();
                    cout<<"Popped from left: "<<x<<endl;
                    d.pop_front();
                }
            }
            else if(p == "popRight"){
                if(d.size()==0){
                    cout<<"The queue is empty"<<endl;
                }
                else{
                    x=d.back();
                    cout<<"Popped from right: "<<x<<endl;
                    d.pop_back();
                }
            }
        }
        
    }
}
