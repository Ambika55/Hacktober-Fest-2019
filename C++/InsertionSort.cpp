#include<iostream>
using namespace std;

void InsertionSort(int arr[], int size)
{
    int i,j,v;
    for(i=1; i<=size; i++)
    {
        v = arr[i];
        j=i;
        while(arr[j-1]>v && j>=1)
        {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j]= v;
    }
}
void insertionSortRecursive(int arr[], int n) 
{ 
    // Base case 
    if (n <= 1) 
        return; 
  
    // Sort first n-1 elements 
    insertionSortRecursive( arr, n-1 ); 
  
    // Insert last element at its correct position 
    // in sorted array. 
    int last = arr[n-1]; 
    int j = n-2; 
  
    /* Move elements of arr[0..i-1], that are 
      greater than key, to one position ahead 
      of their current position */
    while (j >= 0 && arr[j] > last) 
    { 
        arr[j+1] = arr[j]; 
        j--; 
    } 
    arr[j+1] = last; 
} 
int main()
{
    int arr[20], size,i,n;
    cin>>size;
    for(i=0; i<size; i++)
        cin>>arr[i];
    InsertionSort(arr,size);
    cout<<"Size of the array"<<endl;
    cin>>n;
    insertionSortRecursive(arr,n);
    cout<<"\n After Sorting the Array : ";
    for(i=0; i<size; i++)
        cout<<arr[i]<<" ";
}
