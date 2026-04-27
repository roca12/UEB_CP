#include <bits/stdc++.h>

using namespace std;

int main()
{
    int i,j;
	while (cin>>i && cin>>j) {
		cout<<i<<" "<<j<<" ";
		if (i > j) {
			int x = j;
			j = i;
			i = x;
		} 
		int aux = 0;
		int mayor = 0;
		for (int r = i; r <= j; r++) {
			aux = r;
			int cont = 1;
			while (aux > 1) {
				if (aux%2 != 0) {
					aux = (aux*3) + 1;
				}
				else{
					aux = aux/2;
				}
				cont++;
			}
			if(cont>mayor) mayor = cont;
		}
		cout<<mayor<<endl;
}
}