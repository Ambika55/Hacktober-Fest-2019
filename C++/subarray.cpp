#include<iostream>
#include<cstring>
using namespace std;
int main(){
int arr[100] = {1,2,3,4};
int n = 4;
for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        //cout<<arr[i]<<" "<<arr[j]<<endl;
        for(int k=i;k<=j;k++){
            cout<<arr[k]<<" ";
        }
        cout<<endl;
    }
}
}
