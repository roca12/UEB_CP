/*
* Autor: pgms1103-afk
* Problema: Factory Machines
* Juez Online: CSES
* Veredicto: Accepted
* URL: https://cses.fi/alon/task/1620/
*/
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

    vector <long long > arregloTiempoCadaMaquina;
    long long totalProductos;

bool sePuedeHacer(long long  tiempo)
{
    long long  productosHechos = 0;

    for(long long  tiempoCadaMaquina : arregloTiempoCadaMaquina)
    {
        productosHechos += tiempo/tiempoCadaMaquina;
        if(productosHechos >= totalProductos){
            return true;
        }
    }
    return productosHechos >= totalProductos;
}
int main()
{
    long long numeroMaquinas;
    cin>> numeroMaquinas;
    cin>> totalProductos;

    arregloTiempoCadaMaquina.resize(numeroMaquinas);
    long long  tiempoMaximoMaquina = 0;
    for(int i = 0; i < numeroMaquinas; i++){
        cin>> arregloTiempoCadaMaquina[i];
        if(arregloTiempoCadaMaquina[i] > tiempoMaximoMaquina){
            tiempoMaximoMaquina = arregloTiempoCadaMaquina[i];
        }
    }

    long long menor = 1;
    long long mayor = totalProductos * tiempoMaximoMaquina;
    long long rta = 0;

    while(menor <= mayor){
        long long  mitad = (menor + mayor) / 2;

        if(!sePuedeHacer(mitad)){
            menor = mitad + 1;
        }else{
            rta = mitad;
            mayor = mitad-1;
        }
    }
    cout << rta << endl;
    return 0;
}


