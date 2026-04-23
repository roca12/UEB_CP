#include <bits/stdc++.h>
using namespace std;

int main(){
    string res;
    getline(cin, res);

    if(res == "8 7 6 5 4 3 2 1") {
        cout << "descending" << endl;
    } else if(res == "1 2 3 4 5 6 7 8") {
        cout << "ascending" << endl;
    } else {
        cout << "mixed" << endl;
    }
}