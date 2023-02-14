

#include <iostream>

using namespace std;

int main()
{
    
    int x,y,i=0;
    int r[100];
    while((scanf("%d %d", &x, &y)) != EOF) {
        r[i]=y-x;
        i++;
    }
    for(int e=0; e<i; e++) cout<<r[e]<<endl;

    return 0;
    
    
}
