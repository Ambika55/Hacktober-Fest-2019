#include<iostream>
using namespace std;

void BubbleSort(int arr[], int size)
{
    for(int pass=size-1; pass>=0; pass--)
    {
        for(int i=0; i<=pass; i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;

            }
        }
    }
}

int main()
{
    int arr[20], size,i;
    cin>>size;
    for(i=0; i<size; i++)
        cin>>arr[i];
    BubbleSort(arr,size);
    cout<<"\n After Sorting the Array : ";
    for(i=0; i<size; i++)
        cout<<arr[i]<<" ";
}
