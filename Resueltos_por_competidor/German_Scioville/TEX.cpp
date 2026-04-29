/*
 * Autor: Scioville
 * Problema: TEX Quotes (https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=208)
 * Juez online: Online Judge(UVA)
 * Veredicto: accepted  
 * Don't worry. I probably know a lot more than you think.
 * */
#include <bits/stdc++.h>
using namespace std;

int main()
{

int aux;

string msg,sms;

aux = 1;

while(getline(cin,msg)){
        sms ="";
     for(char k:msg){

    if(k=='"'){
        if(aux==1){
            sms+="``";
            aux =2;
        }else{
            sms+="''";
            aux =1;
        }
    }else{
    sms+=k;
    }

}cout<<sms<<endl;
}
}
