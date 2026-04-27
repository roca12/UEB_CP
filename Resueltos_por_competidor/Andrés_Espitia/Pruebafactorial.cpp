#include<bits/stdc++.h>
using namespace std;

int testcase;
long long A, B;

long long numbers_divisible_by_3_from_1_to_n (int n){
  if(n == 0) return 0;  // Caution: we will also call numbers_divisible_by_3_from_1_to_n(A - 1). If A = 1 then the argument becomes -1 which can result in     
                        // calculation.
  int subs;
  if(n % 3 == 0) {
    subs = n / 3;
  } else { // both n % 3 == 1 and n % 3 == 2 shows the same result
    subs = (n / 3) + 1;
  }
  return n - subs;
}

int main(){
  scanf("%d", &testcase);
  for(int test = 1; test <= testcase; test++){
    scanf("%lld %lld", &A, &B);
    long long result = numbers_divisible_by_3_from_1_to_n (B) - numbers_divisible_by_3_from_1_to_n (A - 1);
    printf("Case %d: %lld\n", test, result);
  }
}
