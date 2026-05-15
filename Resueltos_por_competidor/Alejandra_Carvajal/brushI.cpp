/* Autor: Alejandra Carvajal
* Problema: Brush (I)
* Juez online: LightOJ
* Veredicto: Accepted
* URL: https://lightoj.com/problem/brush-1
*/

#include <bits/stdc++.h>
using namespace std;

int main() {
   
    int t;
    cin>>t;
    int c = 1;
    
    while(c <= t){
        int sum =0;
        int n;
        cin>>n;
        for(int i=1; i<=n; i++){
            int N;
            cin>>N;
            
            if(N > 0){    
               
                sum += N;
            }else{
                N = 0;
            }
           
        }
         cout<< "Case " << c << ": " << sum << endl;
        c++;
    }
    return 0;
}
