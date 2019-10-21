#include<bits/stdc++.h>
#define pb push_back
#define FORA(x,arr) for(auto &(x):(arr))
#define fio freopen("input.txt","r",stdin);freopen("output.txt","w",stdout);
#define LL long long int
using namespace std;
long n,k;
bool check(long *arr,long long val){
    long long x=0,q=0;
    for(long long i=0;i<n && q<k;i++){
        x=x+arr[i];
        if(x>val){
            i--;
            q++;
            x=0;
        }
    }
    if(q<k)
        return 1;
    return 0;
}
long long bs(long *arr,long long l,long long r){
    long long fans=-1;
    while(l<=r){
        long long mid=l+(r-l)/2;
        //cout<<l<<' '<<r<<' '<<check(arr,mid)<<endl;
        if(check(arr,mid)){
            fans=mid;
            r=mid-1;
        }
        else
            l=mid+1;
    }
    return fans;
}
int main(){
    fio
    LL t;
    cin>>t;
    while(t--){
        cin>>n;
        long *arr;
        arr=new long[n];
        LL l=0,r=0;
        for(long i=0;i<n;i++){
            cin>>arr[i];
            r=r+arr[i];
        }
        l=arr[n-1];
        cin>>k;
        //cout<<l<<' '<<r<<endl;
        long long x=bs(arr,l,r);
        cout<<x<<endl;
    }
}