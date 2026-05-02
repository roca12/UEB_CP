#include <bits/stdc++.h>
/*
 * Autor: Tomás Triana Galvis
 * Problema: Count Balls
 * Juez online: AtCoder abc158_b
 * Veredicto: Accepted
 * Url: https://atcoder.jp/contests/abc158/tasks/abc158_b
 **/
using namespace std;

int main()
{
    long long n, a, b;
    cin>>n>>a>>b;
    long long ans = 0;

    ans+=(n/(a+b))*a;
    ans+=min(n%(a+b),a);
    cout<<ans<<endl;

    return 0;
}
