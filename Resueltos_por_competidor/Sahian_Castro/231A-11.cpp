#include <iostream>
using namespace std; 
#define print(x) cout << x << "\n"
 
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n; 
    if(!(cin >> n))
    return 0;
    int resueltos = 0;
    for(int i = 0; i < n; i++){
        int p, v, t;
        cin >> p >> v >> t;
        if(p + v + t >= 2){
            resueltos++;
        }
    }
    
    print(resueltos);
    return 0;
    
}
