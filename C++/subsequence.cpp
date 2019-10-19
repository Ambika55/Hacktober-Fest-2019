
#include<iostream>
using namespace std;
void printSubsequence(int input[],int output[],int n,int inputIndex,int outputIndex){
    if(inputIndex>=n){
        for(int i=0;i<outputIndex;i++){
            cout<<output[i];
        }
        cout<<endl;
        return;
    }
    output[outputIndex] = input[inputIndex];
    printSubsequence(input,output,n,inputIndex+1,outputIndex+1);
    printSubsequence(input,output,n,inputIndex+1,outputIndex);
    return;
}
int main(){
int input[10] = {1,2,3,4};
int output[10];
    printSubsequence(input,output,4,0,0);


}

