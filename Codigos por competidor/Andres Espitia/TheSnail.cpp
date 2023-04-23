#include<bits/stdc++.h>

using namespace std;

int main(){
    float h, u, d, f;
    while(true){
        cin>>h>>u>>d>>f;
        if(h==0) break;
        f = (f/100)*u;

        bool success = false;

        float dc = u, c = 0, day = 1;

        while(true){
        	if(day != 1) dc = dc-f;
            c += dc;
            if(c>=h){
                success = true;
                break;
            }
            c -= d;
            day++;
            
            if(dc<=0) break;
        }

        if(success) cout<<"success on day "<<day;
        else if(!success) cout<<"failure on day "<<day;
        cout<<endl;
    }
}
