//
// Created by Usuario on 14/11/2025.
//

#include<bits/stdc++.h>

using namespace std;
int main() {
    string s;
    getline(cin,s);
    int points = 0;
    for (int i = 0; i<s.length();) {
        if (i+4<s.length()) {
            string s1 = s.substr(i,5);
            string s2 = s.substr(i,2);
            if (s1 == "bravo") {
                points+=3;
                i+=5;
            }else if (s1 == "boooo") {
                points-=1;
                i+=5;
            }else if (s2 == "ha") {
                points+=1;
                i+=2;
            }else i++;
        }else if (i+1<s.length()) {
            string s2 = s.substr(i,2);
            if (s2 == "ha") {
                points+=1;
                i+=2;
            }else i++;
        }else break;
    }
    cout<<points<<endl;
}
