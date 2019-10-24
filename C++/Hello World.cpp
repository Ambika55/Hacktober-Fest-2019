#include<iostream>
using namespace std;
class node
{
    public:
    int data;
   node*next;

   node(int d)
  {
       data=d;
       next=NULL;
  }

};

void insertathead(node*&head,int data)
{
    node *n=new node(data);
    n->next=head;
    head=n;
}
void insertAti(node*head, int i, int data)
{
 node*newNode= new node(data);
 int count=0;
 node*temp=head;
 while(count<(i-1) && temp!=NULL)
 {
 temp=temp->next;
 count++;
 }
 if(temp!=NULL)
 {
 newNode->next=temp->next;
 temp->next=newNode;
 }
}

void print(node*head)
{
    node*temp=head;
    while(temp!=NULL)
 {
   cout<<temp->data;
   temp=temp->next;
 } 
 
}

int main()
{
 node*head=NULL;
 insertathead(head,5);
 insertathead(head,4);
 insertathead(head,3);
 insertAti(head,2,10);
 print(head);
 insertAti(head,5,18);
 print(head);

}
