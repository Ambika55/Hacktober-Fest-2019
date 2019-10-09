#include<iostream>
#include<math.h>
using namespace std;

class node{
	public:
		int data;
		node *next;
	node(int d){
		data=d;
		next=NULL;
	}
};

	void insertattail(node *&head,int data){
		if(head==NULL){
			head=new node(data);
			return;
		}
		node *tail=head;
		while(tail->next!=NULL){
			tail=tail->next;
		}
		tail->next=new node(data);
		return;
	}
	
	void print(node *head){
		while(head!=NULL){
			cout<<head->data<<" ";
			head=head->next;
		}
	}
	
	void reverse(node *&head){  
		node *c=head;
		node *p=NULL;
		node *n=NULL;
		while(c!=NULL){
			n=c->next;
			c->next=p;
			p=c;
			c=n;
		}
		head=p;  
}
	
	bool palindrome(node *head,int len){
		node *ptr1=head;
		int number1=0;
		int i=len;
		while(ptr1!=NULL){
			int a=ptr1->data;
			number1=number1+a*pow(10,i-1);
			i--;
			ptr1=ptr1->next;
		}
		reverse(head);
		node *ptr2=head;
		int number2=0;
		int j=len;
		while(ptr2!=NULL){
			int a=ptr2->data;
			number2=number2+a*pow(10,j-1);
			j--;
			ptr2=ptr2->next;
		}
		if(number1==number2){
			cout<<"True";
			return true;
		}
		else{
			cout<<"False";
			return false;
		}
	}
	
	int main(){
		node *head=NULL;
		int arr[200];
		int len;
		cin>>len;
		int i=0;
		while(i<len){
			cin>>arr[i];
			insertattail(head,arr[i]);
			i++;
		}
		//print(head);
		//cout<<endl;
		//everse(head);
		//print(head);
		//cout<<endl;
		palindrome(head,len);
		return 0;
	}
