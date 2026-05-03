/*
 * Autor: OtherSpanish
 * Problema: Bender B. Rodríguez Problem 
 * Juez online: UVA
 * Veredicto: Accepted
 * URL: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&category=0&problem=2502&mosmsg=Submission+received+with+ID+31108467
 */

#include <iostream>
using namespace std;

int main() {
    int L;
    
    while (cin >> L && L != 0) {
        string dir = "+x";
        
        for (int i = 0; i < L - 1; i++) {
            string bend;
            cin >> bend;
            
            if (bend == "No") continue;
            
            if (dir == "+x") dir = bend;
            
            else if (dir == "-x") {
                if (bend == "+y") dir = "-y";
                else if (bend == "-y") dir = "+y";
                else if (bend == "+z") dir = "-z";
                else if (bend == "-z") dir = "+z";
            }
            
            else if (dir == "+y") {
                if (bend == "+y") dir = "-x";
                else if (bend == "-y") dir = "+x";
            }
            
            else if (dir == "-y") {
                if (bend == "+y") dir = "+x";
                else if (bend == "-y") dir = "-x";
            }
            
            else if (dir == "+z") {
                if (bend == "+z") dir = "-x";
                else if (bend == "-z") dir = "+x";
            }
            
            else if (dir == "-z") {
                if (bend == "+z") dir = "+x";
                else if (bend == "-z") dir = "-x";
            }
        }
        
        cout << dir << endl;
    }
}
