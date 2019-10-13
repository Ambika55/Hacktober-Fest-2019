#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int a=0,b=1;
    int f=1;
    cout<<"0"<<endl;
    for(int i=2;i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<f<<" ";
            f=a+b; a=b; b=f;
        }
        cout<<endl;
    }
    return 0;
}
