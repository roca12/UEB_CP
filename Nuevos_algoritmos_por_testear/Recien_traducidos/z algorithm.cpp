#include <bits/stdc++.h>
#define len(x) (int)x.size()
using namespace std;

vector<int> zArray(string s)
{
    int n = len(s);
    vector<int> z(n);
    int x = 0, y = 0;
    for (int i = 1; i < n; ++i)
    {
        z[i] = max(0, min(z[i - x], y - i + 1));
        while (i + z[i] < n && s[z[i]] == s[i + z[i]])
            x = i, y = i + z[i], z[i]++;
    }
    return z;
}

void search(string text, string pattern)
{
    string concat = pattern + "$" + text;
    vector<int> z = zArray(concat);
    for (int i = 0; i < len(z); i++)
    {
        if (z[i] == len(pattern))
        {
            cout << "Pattern found at index " << (i - len(pattern) - 1) << endl;
        }
    }
}

int main()
{
    string text = "GEEKS FOR GEEKS";
    string pattern = "GEEK";
    search(text, pattern);
    return 0;
}
