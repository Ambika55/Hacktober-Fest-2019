// GFG Question
// https://practice.geeksforgeeks.org/problems/sum-of-bit-differences/0
// Approach -> Brute Force Pelo : O(n^2)
// Optimized Apprach
/*
We know that 10 tak ke no 4 bits seh represent kare jaa sakte hai.
Ab, agar humei har array ke pairs chahiye toh simply hum ye dekh rahe h ki konsi bits diff hai..
Toh hum ek loop mei.
Har no ki 1st bit dekhenge.
Fir 2nd bit ka count
AB sabka count agya;
Total n elem unme eg 1st k bits active hia
TOh diff bits hui
k*(n-k)
aur kuki i,j, aur j,i pair honge
toh iski 2*k*(n-k) Bit diff 
Therefore this can be done in O(n*p)
p=No of bits.
*/
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
	int t,n;
	cin>>t;
	while(t--){
		cin>>n;
		int arr[n];
		FORA(x,arr)
			cin>>x;
		int p,count,res=0;
		FOR(i,0,3){
			p=1<<i;
			count=0;
			FOR(j,0,n-1){
				if(arr[j] & p)
					count++;
			}
			res=res+(count*(n-count)*2);
		}
		cout<<res<<endl;
	}
}
