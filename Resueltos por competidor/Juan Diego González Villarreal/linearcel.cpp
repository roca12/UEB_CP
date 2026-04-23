#include <bits/stdc++.h>

using namespace std;

vector<int> dna(10);
vector<int> crrline(40);
vector<int> nxtline(40);

int main(){
    int t, aux;
    cin>>t;
    
    
    while(t--){
        fill(dna.begin(), dna.end(), 0);
        fill(crrline.begin(), crrline.end(), 0);
        crrline[19] = 1;
        fill(nxtline.begin(), nxtline.end(), 0);
        
        for(int i = 0; i < 10; i++) cin>>dna[i];
        
        for(int j = 0; j < 50; j++){
            for(auto i : crrline) cout<<(i == 0 ? ' ' : i == 1 ? '.' : i == 2 ? 'x' : 'W');
            cout<<endl;
            
            for(int i = 0; i < 40; i++){
                if(i-1 < 0) aux = crrline[i] + crrline[i+1];
                else if(i+1 > 39) aux = crrline[i] + crrline[i-1];
                else aux = crrline[i] + crrline[i-1] + crrline[i+1];
                
                nxtline[i] = dna[aux];
            }
            
            for(int i = 0; i < 40; i++){
                crrline[i] = nxtline[i];
            }
        }
        
        if(t) cout<<endl;
    }
    
}