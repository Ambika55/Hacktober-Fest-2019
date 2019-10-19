#include<iostream>
using namespace std;
bool isSafe(int arr[100][100],int n,int x,int y){
    for(int i=x+1,j=y;i<n && i>=0;i++){
        if(arr[i][j]==1){
            return false;
        }
    }
    for(int i=x-1,j=y;i<n && i>=0;i--){
        if(arr[i][j]==1){
            return false;
        }
    }
    for(int i=x,j=y+1;j<n && j>=0;j++){
        if(arr[i][j]==1){
            return false;
        }
    }
    for(int i=x,j=y-1;j<n && j>=0;j--){
        if(arr[i][j]==1){
            return false;
        }
    }
    for(int i=x+1,j=y+1;i<n && i>=0 &&j<n && j>=0;j++,i++){
        if(arr[i][j]==1){
            return false;
        }
    }
    for(int i=x-1,j=y-1;i<n && i>=0 &&j<n && j>=0;j--,i--){
        if(arr[i][j]==1){
            return false;
        }
    }
    for(int i=x+1,j=y-1;i<n && i>=0 &&j<n && j>=0;j--,i++){
        if(arr[i][j]==1){
            return false;
        }
    }
    for(int i=x-1,j=y+1;i<n && i>=0 &&j<n && j>=0;j++,i--){
        if(arr[i][j]==1){
            return false;
        }
    }
    return true;
}
bool isSafe2(int arr[100][100],int n,int x,int y){
    int check[8][2] =  {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    for(int k=0;k<8;k++){
        for(int i=x+check[k][0],j=y+check[k][1];i<n && i>=0 &&j<n && j>=0;i+=check[k][0],j+=check[k][1]){
            if(arr[i][j]==1){
                return false;
            }
        }
    }
    return true;
}
int nQueen(int arr[100][100],int n,int x,int y){
    if(y==n){
        cout<<"#####################################"<<endl;;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cout<<arr[i][j]<<" ";
            }
            cout<<endl;
        }
        cout<<"#####################################"<<endl;;
        return 1;
    }
    int count = 0;
    for(int i=0;i<n;i++){
        if(isSafe(arr,n,i,y)){
            arr[i][y] = 1;
            //bool done = nQueen(arr,n,0,y+1);
            /*
            if(done){
                return true;
            }*/
            count+=nQueen(arr,n,0,y+1);
            arr[i][y] = 0;
        }
    }
    return count;
}
int main(){
int arr[100][100];
for(int i=0;i<100;i++){
    for(int j=0;j<100;j++){
        arr[i][j] = 0;
    }
}
cout<<nQueen(arr,8,0,0)<<endl;;
}

