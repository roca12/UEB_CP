#include<bits/stdc++.h>
using namespace std;

int main() {
    int age1, age2, amount1, amount2, expectancy, total1, total2;
    cin>>age1>>amount1>>age2>>amount2>>expectancy;
    total1 = (expectancy-age1)*amount1;
    total2 = (expectancy-age2)*amount2;
    if (total1>=total2) {
        cout<<"1"<<endl;
    }else {
        cout<<"2"<<endl;
    }
}
