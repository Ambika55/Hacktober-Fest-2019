#include <bits/stdc++.h>
using namespace std;

template < typename T > class Stack;

template < typename T > class node {
    friend class Stack < T >;
    private:
        T data;
        node * next;
    public:
        node(node < T > * next, T data) : data(data), next(next) {}
};

template < typename T > class Stack {
    public:
        Stack();
        void push(T data);
        void pop();
        T top();
        bool empty();
    private:
        node < T > * head; 
};

template < typename T > Stack < T > :: Stack() : head(NULL) {}

template < typename T > void Stack < T > :: push(T data) 
{
    if(head == NULL) {
        head = new node < T > (NULL, data);
    }    
    else {
        node < T > * temp = head;
        head =  new node < T > (NULL, data);
        head -> next = temp;
    }
}

template < typename T > void Stack < T > :: pop() 
{
    if(head != NULL) {
        head = head -> next;
    }
    else {
        return;
    }
}

template < typename T > T Stack < T > :: top() 
{
    if(head != NULL) {
        return head -> data;    
    }
}

template < typename T > bool Stack < T > :: empty()
{
    if(head == NULL) {
        return true;
    }
    else {
        return false;
    }
}

int main()
{
    Stack < int > s;
    
    for(int i = 0; i < 10; i ++) {
        s.push(i);
    }
    
    while(!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
    return 0;
}
