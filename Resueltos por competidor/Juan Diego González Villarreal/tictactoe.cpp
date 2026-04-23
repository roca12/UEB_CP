#include <iostream>
#include <vector>
#include <string>
using namespace std;

bool gana(vector<string>& tablero) {
    for (int i = 0; i < 3; i++) {
        if (tablero[i][0] == 'X' && tablero[i][1] == 'X' && tablero[i][2] == 'X') {
            return true;
        }
    }

    for (int j = 0; j < 3; j++) {
        if (tablero[0][j] == 'X' && tablero[1][j] == 'X' && tablero[2][j] == 'X') {
            return true;
        }
    }

    if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X') {
        return true;
    }
    if (tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][0] == 'X') {
        return true;
    }

    return false;
}

int countX(vector<string>& tablero) {
    int count = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (tablero[i][j] == 'X') {
                count++;
            }
        }
    }
    return count;
}



string mover(vector<string> tablero, bool aliceTurn) {
    if (gana(tablero)) {
        return aliceTurn ? "Alice" : "Bob";
    }

    bool canWin = false;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (tablero[i][j] == '.') {
                tablero[i][j] = 'X';

                string res = mover(tablero, !aliceTurn);


                if ((aliceTurn && res == "Alice") || (!aliceTurn && res == "Bob")) {
                    canWin = true;
                }

                tablero[i][j] = '.';

                if (canWin) break;
            }
        }
        if (canWin) break;
    }

    if (canWin) {
        return aliceTurn ? "Alice" : "Bob";
    } else {
        return aliceTurn ? "Bob" : "Alice";
    }
}

string findWinner(vector<string>& tablero) {

    if (gana(tablero)) {

        int xCount = countX(tablero);
        if (xCount % 2 == 1) {
            return "Bob";
        } else {
            return "Alice";
        }
    }

    return mover(tablero, true);
}

int main() {
    int n;
    cin >> n;

    for (int i = 1; i <= n; i++) {
        vector<string> board(3);
        for (int j = 0; j < 3; j++) {
            cin >> board[j];
        }

        string winner = findWinner(board);
        cout << "Game #" << i << ": " << winner << endl;
    }

    return 0;
}