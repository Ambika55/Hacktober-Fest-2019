#include <iostream>
using namespace std;

int fiboHelper(int n, int *ans){
if(n <= 1){
    return n;
}

if(ans[n] != -1){
    return ans[n];
}

int a = fiboHelper(n-1, ans);
int b = fiboHelper(n-2, ans);

ans[n] = a + b;

return ans[n];
}

int fibo(int n){
int *ans = new int[n+1];
for(int i = 0; i < n+1; i++){
    ans[i] = -1;
}

return fiboHelper(n, ans);
}

int main(){
int n;
cin >> n;
cout << n << "th Fibonacci number is " << fibo(n) << endl;
}
