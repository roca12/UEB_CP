/*
 * Autor: Scioville
 * Problema: Relational Operator (https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=2113)
 * Juez online: Online Judge(UVA)
 * Veredicto: accepted  
 * I Gently Open the Door
 * */

#include <bits/stdc++.h>
using namespace std;

int main()
{

int t,x,y;

cin >> t;

while(t>0){
    cin>>x>>y;
    
    if(x>y){
    cout<<">"<<endl;    
    }else if(x<y){
    cout<<"<"<<endl;
    }else{
    cout<<"="<<endl;
    }
    
    t--;
}

}
