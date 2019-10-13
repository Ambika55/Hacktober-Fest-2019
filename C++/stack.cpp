#include<iostream>
using namespace std;

int top=-1,size;

int isFull()
{
    if(top==size-1)
        return 1;
    else
        return 0;
}
int isEmpty()
{
    if(top==-1)
        return 1;
    else
        return 0;
}
void push(int value,int stack[])
{
    if(isFull())
        cout<<"The stack is Full.\n";
    else
        stack[++top]=value;
}
void pop(int stack[])
{

    if(isEmpty())
        cout<<"Stack is Empty.\n";
    else
        cout<<stack[top--]<< " is deleted from the stack.\n";
}
void traversal(int stack[])
{
    if(isEmpty())
        cout<<"stack is empty\n";
    else
  {
  cout<< "Stack: ";
   int i=top;
    while(i>=0)
    {
        cout<<"\t" <<stack[i];
        i--;
    }
    cout<<endl;
  }
}

main()
{
 cout<<"Enter size of Stack.\n";
 cin>>size;
 int stack[size];

 int choice,value;
 char c;
 do
{
     cout<<"Enter your choice:"<<"\n1. Insertion  2. Deletion  3. Display\n";
     cin>>choice;
     switch(choice)
     {
         case 1: cout<<"Enter element to be inserted :    ";
                    cin>>value;
                    push(value,stack);
                    break;
        case 2: pop(stack);
        case 3: traversal(stack);
                break;
        default: cout<<"Sorry wrong Input\n";

     }
     cout<<"enter y or Y to continue....   ";
     cin>>c;
}while(c=='y'||c=='Y');
 return 0;
}
