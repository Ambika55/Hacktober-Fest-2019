#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    for(int i=0;i<n/2;i++)
    {
        cout<<" ";
    }
    cout<<"*"<<endl;

for(int i=0;i<n/2;i++)
{
    for(int j=(n/2-1)-i;j>0;j--)
    {
        cout<<" ";
    }
    cout<<"*";
    for(int k=0;k<(2*i+1);k++)
    {

       cout<<" ";
    }
    cout<<"*"<<endl;
}
int l=0;
for(int i=n/2-1;i>0;i--)
{
    for(int j=0;j<n/2-i;j++)
    {
        cout<<" ";
    }
    cout<<"*";

    for(int k=n-4;k-l>0;k--)
    {
        cout<<" ";
    }
    l+=2;

cout<<"*"<<endl;
}
for(int i=n/2;i>0;i--)
{
    cout<<" ";
}cout<<"*"<<endl;

}
