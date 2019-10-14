#include<iostream>
#include<queue>
using namespace std;
int main(){
    //max heap
priority_queue<int>p1;

// min heap
priority_queue<int,vector<int>,greater<int>>p;
p.push(10);
p.push(20);
p.push(30);
cout<<p.top()<<" ";
p.pop();
cout<<p.top()<<endl;
}
