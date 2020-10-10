#include<iostream>
using namespace std;
int reverse(int* a,int l,int k)
{ 
 while(l<k)
 {
     int temp= a[l];
     a[l]=a[k];
     a[k]=temp;
     l++;
     k--;

 }

   return 0;
}
int main()
{
    int n,d;
    cout<<"enter size";
    cin>>n;
    int arr[n];
    cout<<"enter elements in array";
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    cout<<"enter d";
    cin>>d;
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
    for(int i=0;i<n;i++)
 {
     cout<<arr[i]<<" ";
 }
}

