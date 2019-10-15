#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
   struct node *next;
};

void main()
{
  struct node *head=NULL;
  struct node *temp=head;
  int data;
  scanf("%d",&data);
  while(data!=-1)
  {
      struct node* newNode = (struct node*) malloc(sizeof(struct node));
      newNode->data=data;
      newNode->next=NULL;
      if(temp==NULL)
      {
          head=newNode;
          temp=newNode;
      }
      else
      {
          while(temp -> next != NULL) {
				temp = temp -> next;
			}
          temp->next=newNode;
      }
      scanf("%d",&data);
  }
  while(head!=NULL)
  {
      printf("%d ",head->data);
      head=head->next;
  }
}
