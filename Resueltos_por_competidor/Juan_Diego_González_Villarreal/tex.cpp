#include<bits/stdc++.h>

using namespace std;

int main() {
    string line;
    bool open = true;
    while (getline(cin, line)) {
        for (int i = 0; i < line.size(); i++) {
            if (line[i] == '"' && open) {
                line = line.substr(0, i)+ "``"+line.substr(i+1, line.size()-i);
                open = false;
            }else if (line[i] == '"' && !open) {
                line = line.substr(0, i)+ "''"+line.substr(i+1, line.size()-i);
                open = true;
            }
        }
        cout << line << endl;
    }
}
