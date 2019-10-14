#include<iostream>
#include<list>
#include<queue>
#include<vector>
using namespace std;
class graph{
    int v;
    list<int>* l;

public:
    graph(int v){
        this->v = v;
        l = new list<int>[v];
    }
    void addEdge(int src,int dest, bool bidir = false){
        l[src].push_back(dest);
        if(bidir){
            l[dest].push_back(src);
        }
    }
    void bfsDriver(int vertex,vector<bool>& visited){
        queue<int>q;
        q.push(vertex);
        visited[vertex] = 1;
        while(!q.empty()){
            int top = q.front();
            cout<<top;
            //list<int>:: iterator it;
            for(auto it = l[top].begin();it!=l[top].end();it++){
                int curr = *it;
                if(visited[curr]==false){
                    q.push(curr);
                    visited[curr] = true;
                }
            }
            q.pop();
        }
    }

    void bfs(){
        vector<bool> visited;
        for(int i=0;i<v;i++){
            visited.push_back(false);
        }
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                bfsDriver(i,visited);
            }
        }
    }

    void print(){
        for(int i=0;i<v;i++){
            //list<int>:: iterator it;
            cout<<i<<"  --> ";
            for(auto it = l[i].begin();it!=l[i].end();it++){
                cout<<*it<<" , ";
            }
            cout<<endl;
        }
    }
};
