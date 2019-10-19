#include<iostream>
using namespace std;
bool isSafe(int arr[100][100],int n,int x,int y,int value){
    //check in all 4 directions

    //checking inside block
    int x1 = 3*(x/3);
    int y1 = 3*(y/3);
    for(int i=x1;i<x1+3;i++){
        for(int j=y1;j<y1+3;j++){
            if(arr[i][j]==value){
                return false;
            }
        }
    }
    return true;
}
bool sudoko(int arr[100][100],int n,int x,int y){
    if(x==n-1 && y==n){
        // print
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cout<<arr[i][j]<<" ";
            }
            cout<<endl;
        }
        return true;
    }
    if(y==n){
        return sudoko(arr,n,x+1,0);
    }
    if(arr[x][y]==0){
        for(int k=1;k<10;k++){
            if(isSafe(arr,n,x,y,k)){
                arr[x][y] = k;
                bool done = sudoko(arr,n,x,y+1);
                if(done){
                    return true;
                }
                arr[x][y] = 0;
            }
        }
    }else{
        return sudoko(arr,n,x,y+1);
    }
    return false;
}
int main(){

}
