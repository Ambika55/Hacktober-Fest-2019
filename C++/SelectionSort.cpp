#include<iostream>
using namespace std;

void SelectionSort(int arr[], int size)
{
    int i,j,min;
    for(i=0; i<size-1; i++)
    {
        min = i;
        for(j=i+1; j<size; j++)
        {
            if(arr[j]<arr[min])
                min =j;
        }
        int temp = arr[min];
        arr[min]= arr[i];
        arr[i]=temp;

    }
}
void recurSelectionSort(int a[], int n, int index = 0) 
{ 
    // Return when starting and size are same 
    if (index == n) 
       return; 
  
    // calling minimum index function for minimum index 
    int k = minIndex(a, index, n-1); 
  
    // Swapping when index nd minimum index are not same 
    if (k != index) 
       swap(a[k], a[index]); 
  
    // Recursively calling selection sort function 
    recurSelectionSort(a, n, index + 1); 
} 
  

int main()
{
    int arr[20], size,i;
    cin>>size;
    for(i=0; i<size; i++)
        cin>>arr[i];
    for(i=0;i<n;i++)
        cin>>a[i];
    SelectionSort(arr,size);
    cout<<"\n After Sorting the Array : ";
    for(i=0; i<size; i++)
        cout<<arr[i]<<" ";
    cout<<"\n After Sorting the Array recursively : ";
    for(i=0; i<n; i++)
        cout<<a[i]<<" ";
}
