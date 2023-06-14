
#include <bits/stdc++.h> 

#define N 3 
using namespace std;

bool isMagicSquare(int mat[][N]) {

    int sum = 0, sum2 = 0;
    for (int i = 0; i < N; i++)
        sum = sum + mat[i][i];
    for (int i = 0; i < N; i++)
        sum2 = sum2 + mat[i][N - 1 - i];

    if (sum != sum2)
        return false;

    for (int i = 0; i < N; i++) {

        int rowSum = 0;
        for (int j = 0; j < N; j++)
            rowSum += mat[i][j];

        if (rowSum != sum)
            return false;
    }


    for (int i = 0; i < N; i++) {

        int colSum = 0;
        for (int j = 0; j < N; j++)
            colSum += mat[j][i];
        if (sum != colSum)
            return false;
    }

    return true;
}

int main() {
    int mat[][N] = {
        { 2, 7, 6},
        { 9, 5, 1},
        { 4, 3, 8}};

    if (isMagicSquare(mat))
        cout << "Magic Square";
    else
        cout << "Not a magic Square";

    return 0;
} 