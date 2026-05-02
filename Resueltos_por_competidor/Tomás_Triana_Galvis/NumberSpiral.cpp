#include <iostream>
 /*
 * Autor: Tomás Triana Galvis
 * Problema: Number Spiral
 * Juez online: CSES 16755425
 * Veredicto: Accepted
 * Url: https://cses.fi/problemset/result/16755425/
 **/
using namespace std;

int main()
{
    long long t, x,y;
    cin>>t;
    for(long long i=0; i<t;i++){
        cin>>x>>y;
        long long ans = 0;
        if(x>y){
            ans+=(x*x)-(x-1);
            if(x%2==1){
                ans-=x-y;
            }else{
                ans+=x-y;
            }
        }else{
            ans+=(y*y)-(y-1);
            if(y%2==1){
                ans+=y-x;
            }else{
                ans-=y-x;
            }
        }
        cout<<ans<<endl;
 
    }
    return 0;
}
