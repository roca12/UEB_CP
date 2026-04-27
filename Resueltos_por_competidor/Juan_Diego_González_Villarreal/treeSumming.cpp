#include <bits/stdc++.h>
using namespace std;

int main() {
    int duration, n;
    double downPayment, loan;

    while (cin >> duration >> downPayment >> loan >> n) {
        if (duration < 0) break;

        map<int, double> depreciation;
        for (int i = 0; i < n; i++) {
            int month;
            double rate;
            cin >> month >> rate;
            depreciation[month] = rate;
        }

        double monthlyPayment = loan / duration;
        double carPrice = (loan + downPayment) * (1 - depreciation[0]);
        double owed = loan;
        double currentRate = depreciation[0];

        if (owed < carPrice) {
            cout << "0 months" << endl;
            continue;
        }

        int month = 0;
        while (true) {
            month++;
            owed -= monthlyPayment;

            if (depreciation.find(month) != depreciation.end())
                currentRate = depreciation[month];

            carPrice *= (1 - currentRate);

            if (owed < carPrice)
                break;
        }

        cout << month << " month" << (month != 1 ? "s" : "") << endl;
    }

    return 0;
}
