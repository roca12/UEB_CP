#include <bits/stdc++.h>

using namespace std;

int main(){
    int round;
    while(true){
        unordered_set<char> usadas;
        unordered_set<char> solucion;
        int cont = 0;
        string palabra,intentos;
        cin>>round;
        if(round==-1) break;
        cin.ignore();
        cin>>palabra>>intentos;
        for(char c: palabra){
            solucion.insert(c);
        }
        for(char c: intentos){
            if(
                !solucion.empty()
                && usadas.find(c) == usadas.end()
                && solucion.find(c) != solucion.end()
                &&cont<7
            ){
                solucion.erase(c);
            }else if(
                !solucion.empty()
                && usadas.find(c) == usadas.end()
                && solucion.find(c) == solucion.end()
                && cont<7
            ){
                cont++;
            }else if(solucion.empty()||cont>=7){
                break;
            }
            usadas.insert(c);  
        }
        cout<<"Round "<<round<<endl;
        if(cont>=7){
            cout<<"You lose."<<endl;
        }else if(cont<7 && !solucion.empty()){
            cout<<"You chickened out."<<endl;
        }else if(cont<7){
            cout<<"You win."<<endl;
        }
    }
}
