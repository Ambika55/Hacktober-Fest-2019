#include<bits/stdc++.h>
using namespace std;
int main() {
    int arr[100];
    int N,max_value;
    cin>>N;
    for(int i=0;i<N;i++){
        cin>>arr[i];
    }
    max_value = arr[0];
   for(int i = 1;i < N; i++) {
       if(max_value <  arr[i])
         max_value = arr[i];
   } 
   cout<<max_value;
   return 0;
}

	