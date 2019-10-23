#include<iostream>
using namespace std;
class  queue{
    int * arr;
    int front;
    int rear;
    int max_size;
    int curr_size;
public:
    queue(int size){
        max_size = size;
        arr = new int[size];
        curr_size = 0;
        front = 0;
        rear = size-1;
    }

    bool isEmpty(){
        return curr_size==0;
    }

    bool isFull(){
        return max_size==curr_size;
    }

    void enqueue(int data){
        if(!isFull()){
            rear= (rear+1)%(max_size);
            arr[rear] = data;
            curr_size++;
            return;
        }
        cout<<"Queue is full, please wait!"<<endl;
        return;
    }

    void dequeue(){
        if(isEmpty()){
            cout<<"Noting to deque!"<<endl;
            return;
        }
        front = (front+1)%max_size;
        curr_size--;
        return;
    }

    int top(){
        if(!isEmpty()){
            return arr[front];
        }
        return -1;
    }

    int size(){
        return curr_size;
    }

};
int main(){
queue q(3);
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.enqueue(40);
cout<<q.size()<<endl;
//cout<<q.arr[3]<<endl;
cout<<q.top()<<endl;
q.dequeue();
q.enqueue(40);
cout<<q.top()<<endl;
q.dequeue();
cout<<q.top()<<endl;
q.dequeue();
cout<<q.top()<<endl;
q.dequeue();
cout<<q.top()<<endl;
}

