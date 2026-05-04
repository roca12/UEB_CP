/*
 * Autor: Juan Diego González Villarreal
 * Problema: Rooks Defenders
 * Juez online: Codeforces
 * Veredicto: Accepted
 * URL:https://codeforces.com/contest/1679/problem/C
 */
 #include<bits/stdc++.h>
using namespace std;

struct FenwickTree {
    int n;
    vector<int> tree;
    FenwickTree(int n) : n(n), tree(n + 1, 0) {}
    void update(int i, int val) {
        for (; i <= n; i += i & -i) tree[i] += val;
    }
    int query(int i) {
        int sum = 0;
        for (; i > 0; i -= i & -i) sum += tree[i];
        return sum;
    }
    int queryRange(int l, int r) {
        return query(r) - query(l - 1);
    }
};

int main(){
    ios_base::sync_with_stdio(false); cin.tie(NULL); 
    int n, q;
    cin >> n >> q;
    
    FenwickTree ftRows(n), ftCols(n);
    vector<int> rowCount(n + 1, 0), colCount(n + 1, 0);

    while(q--){
        int t; cin >> t;
        if(t == 1){
            int x, y; cin >> x >> y;
            if(rowCount[x] == 0) ftRows.update(x, 1);
            if(colCount[y] == 0) ftCols.update(y, 1);
            rowCount[x]++;
            colCount[y]++;
        }
        else if(t == 2){
            int x, y; cin >> x >> y;
            rowCount[x]--;
            colCount[y]--;
            if(rowCount[x] == 0) ftRows.update(x, -1);
            if(colCount[y] == 0) ftCols.update(y, -1);
        }
        else {
            int x1, y1, x2, y2;
            cin >> x1 >> y1 >> x2 >> y2;
            //PUTA MIERDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
            bool allRows = (ftRows.queryRange(x1, x2) == (x2 - x1 + 1));
            bool allCols = (ftCols.queryRange(y1, y2) == (y2 - y1 + 1));
            
            if(allRows || allCols) cout << "Yes\n";
            else cout << "No\n";
        }
    }
    return 0;
}