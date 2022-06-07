/*****************************************
  Reverse and Add
 ***ID: 10018
 ***Juez: UVA
 ***Tipo: Ad hoc
 *****************************************/
//old code
#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;


bool isPal(string c){
    int l=c.length();
    for(int i=0,j=l-1;i<=l/2 && j>=l/2;i++,j--){
        if(c[i]!=c[j])return false;
    }
    return true;
}

long long toLong(string s){
    stringstream ss(s);
    long long n;
    ss>>n;
    return n;
}

string toStr(long long n){
    stringstream ss;
    ss<<n;
    string s;
    ss>>s;
    return s;
}

int main(){
    int casos,it,i;
    cin>>casos;
    string n,nr;
    while(casos--){
        cin>>n;
        i=0;
        while(i<1005){
            nr=n;
            reverse(nr.begin(),nr.end());
            n=toStr(toLong(n)+toLong(nr));
            i++;
            if(isPal(n)){
                cout<<i<<" "<<n<<endl;
                break;
            }

        }
    }

    return 0;
}
