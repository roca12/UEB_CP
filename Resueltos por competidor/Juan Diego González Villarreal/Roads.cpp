#include<bits/stdc++.h>
//Depende los limites del ejercicio
#define MAX 100005
using namespace std;

int padre[MAX];

struct Edge {
    int origen, destino, peso;
    bool operator<(const Edge &t) const {
        return peso < t.peso;
    }
};

void makeSet(int n) {
    for (int i = 0; i <= n; i++) padre[i] = i;
}

int find(int x) {
    return (x == padre[x] ? x : (padre[x] = find(padre[x])));
}

void Union(int x, int y) {
    int raizX = find(x);
    int raizY = find(y);
    if (raizX != raizY) padre[raizX] = raizY;
}

bool sameComponent(int x, int y) {
    return find(x) == find(y);
}

vector<Edge> vec;

void KruskalMST(int V) {
    int total = 0;
    makeSet(V);
    sort(vec.begin(), vec.end());
    for (int i = 0; i < vec.size(); i++) {
        if (!sameComponent(vec[i].origen, vec[i].destino)) {
            total += vec[i].peso;
            Union(vec[i].origen, vec[i].destino);
        }
    }
    //Es posible imprimir el arbol si se desea.
    cout << total << endl;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, m, r;
    cin>>n>>m>>r;
    for (int i = 0; i < m; i++) {
        Edge edge;
        cin >> edge.origen >> edge.destino;
        edge.peso = 0;
        vec.push_back(edge);
    }
    for (int i = 0; i < r; i++) {
        Edge edge;
        cin >> edge.origen >> edge.destino >> edge.peso;
        vec.push_back(edge);
    }
    KruskalMST(n);
}