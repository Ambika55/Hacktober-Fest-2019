#include<bits/stdc++.h>
#define LL long long
#define FOR(i,a,b) for(auto i=(a);i<=(b);i++)
#define elif else if
#define FORA(x,arr) for(auto &x:arr)
#define fastio ios_base::sync_with_stdio(false);cin.tie(NULL);
#define pb push_back
#define fio freopen("input.txt","r",stdin);freopen("output.txt","w",stdout);
#define UL unsigned long
using namespace std;
int main(){
    fastio
    fio
    int t,n,k,x;
    cin>>t;
    while(t--){
        cin>>n>>k;
        int arr[n];
        FOR(i,0,n-1)
            cin>>arr[i];
        sort(arr,arr+n);
        int i,j,count=0;
        int sc=0,cnt;   // Total elem which are greater than k
        for(j=n-1;j>=0;){
            if(arr[j]>=k){
                j--;
                sc++;
            }
            else
                break;
        }
        // Unsolved Point we got is j.
        priority_queue<int,vector<int>,greater<int>> pq;
        for(i=0;i<j;){
            if(arr[i]+arr[j]>=k){
                i++;
                j--;
                count++;
                sc++;
            }
            else{
                pq.push(arr[i]);
                i++;
            }
        }
        if(j!=-1 && i==j)
            pq.push(arr[j]);
        cnt=count;
        cout<<pq.size()<<' '<<j<<' '<<sc<<' '<<count<<endl;
        count=count+pq.size();
        //cout<<cnt<<' '<<count;
        while(pq.size()>1){
            int x1,x2;
            x1=pq.top();
            pq.pop();
            x2=pq.top();
            pq.pop();
            if(x1+x2>=k)
                sc++;
            else
                pq.push(x1+x2);
            cnt++;
        }
        //cout<<sc<<' '<<cnt<<' '<<count<<endl;
        cnt+=pq.size();
        if(sc<=0)
            cout<<-1;
        else
            cout<<min(cnt,count);
        cout<<endl;
    }
}   
