#include<iostream>
#include<unordered_set>
using namespaces std;
int main(){
int arr[100] ={1,-5,3,2,5};
unordered_set<int>myset;
for(int i=0;i<5;i++){
    int x = arr[i];
    if(myset.find((-1)*x)!=myset.end()){
        cout<<x<<" "<<-x<<endl;
        myset.erase(-x);
    }else{
        myset.insert(x);
    }
}
}
