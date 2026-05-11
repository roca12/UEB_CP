/* Autor: Alejandra Carvajal
* Problema: Boiled Eggs
* Juez online: LightOJ
* Veredicto: Accepted
* URL: https://lightoj.com/problem/boiled-eggs
*/
#include <iostream>
using namespace std;
int main()
{
    int t;
    cin>>t;
    int caso = 1;

    for(int i=0; i<t; i++){
        int acumulador =0;
        int n, p, J;
        cin >>n>>p>>J;
        int contador =0;
        for(int j=0; j<n; j++){
            int Q;
            cin>>Q;
            if((acumulador + Q <=J) && (contador < p)){
                acumulador += Q;
                contador++;
            }
        }
        cout<<"Case " << caso << ": " << contador<<endl;
        caso ++;
    }

    return 0;
}
