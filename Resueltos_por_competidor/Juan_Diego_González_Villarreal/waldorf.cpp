#include <bits/stdc++.h>
using namespace std;

struct Point {
    double x, y;
};

double dist(const Point &a, const Point &b) {
    double dx = a.x - b.x;
    double dy = a.y - b.y;
    return dx*dx + dy*dy;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    while (cin >> n && n) {
        vector<Point> pts(n);
        for (int i = 0; i < n; i++) cin >> pts[i].x >> pts[i].y;


        sort(pts.begin(), pts.end(), [](auto &a, auto &b){
            return a.x < b.x || (a.x == b.x && a.y < b.y);
        });


        set<pair<double,double>> active;
        int left = 0;
        double bestDist = 1e18;
        Point A, B;

        for (int i = 0; i < n; i++) {
            Point p = pts[i];


            while (left < i && (p.x - pts[left].x)*(p.x - pts[left].x) > bestDist) {
                active.erase({pts[left].y, pts[left].x});
                left++;
            }


            auto lower = active.lower_bound({p.y - sqrt(bestDist), -1e18});
            auto upper = active.upper_bound({p.y + sqrt(bestDist), 1e18});
            for (auto it = lower; it != upper; ++it) {
                Point q = {it->second, it->first};
                double d = dist(p,q);
                if (d < bestDist) {
                    bestDist = d;
                    A = p; B = q;
                }
            }

            active.insert({p.y, p.x});
        }

        cout << fixed << setprecision(2)
             << A.x << " " << A.y << " "
             << B.x << " " << B.y << "\n";
    }
}