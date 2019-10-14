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
    void dfsDriver(int vertex, vector<bool>& visited){
        if(visited[vertex]){
            return;
        }
        cout<<vertex<<" ";
        visited[vertex] = true;
        for(auto it = l[vertex].begin();it!=l[vertex].end();it++){
            dfsDriver(*it,visited);
        }
    }

    void dfs(){
        vector<bool> visited;
        for(int i=0;i<v;i++){
            visited.push_back(false);
        }
        for(int i=0;i<v;i++){
            dfsDriver(i,visited);
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
