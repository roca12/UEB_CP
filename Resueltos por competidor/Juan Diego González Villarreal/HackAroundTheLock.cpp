#include <bits/stdc++.h>
using namespace std;

int n;
int cur[10];
bool first_output;

void print_combo() {
    if (!first_output) cout << ' ';
    first_output = false;
    for (int i = 0; i < n; i++) cout << cur[i];
}


void traverse(int pos) {
    if (pos < 0) return;

    int d = cur[pos];

    traverse(pos - 1);

    int first_step, near_end, far_end;
    if (d <= 4) {
        first_step = -1; near_end = 0; far_end = 9;
    } else {
        first_step = +1; near_end = 9; far_end = 0;
    }

    int v = d;
    while (v != near_end) {
        v += first_step;
        cur[pos] = v;
        print_combo();
        traverse(pos - 1);
    }
    int second_step = -first_step;
    while (v != far_end) {
        v += second_step;
        cur[pos] = v;
        print_combo();
        traverse(pos - 1);
    }

}

void solve(const string &s) {
    n = (int)s.size();
    for (int i = 0; i < n; i++) cur[i] = s[i] - '0';

    long long total = 1;
    for (int i = 0; i < n; i++) total *= 10;
    total -= 1;
    long long pw = 1;
    for (int i = 0; i < n; i++) {
        total += pw * min(cur[i], 9 - cur[i]);
        pw *= 10;
    }

    cout << total << '\n';
    first_output = true;
    traverse(n - 1);
    cout << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string line;
    while (cin >> line && line != "-1") {
        solve(line);
    }
    return 0;
}