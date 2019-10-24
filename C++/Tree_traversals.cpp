/* program to create a binary tree and print its traversal order */
#include<iostream>
#include<queue>
using namespace std;
struct node
{
    int data;
    node*left;
    node*right;
    node(int data)
    {
        this->data=data;
        left=NULL;
        right=NULL;
    }
};
node*create_tree()
{
    cout<<"\nEnter data of root and -1 to exit "<<endl;
    int data;
    cin>>data;
    node*root=NULL;
    queue<node*> q;
    if(data!=-1)
    {
        root=new node(data);
        q.push(root);
    }
    while(!q.empty())
    {
        node*curr=q.front();
        q.pop();
        cout<<"\nEnter data for the left child of "<<curr->data<<" ";
        cin>>data;
        if(data!=-1)
        {
            node*left=new node(data);
            curr->left=left;
            q.push(left);
        }
        cout<<"\nEnter data for the right child of "<<curr->data<<" ";
        cin>>data;
        if(data!=-1)
        {
            node*right=new node(data);
            curr->right=right;
            q.push(right);
        }
    }
    return root;
}
void preorder(node*root)
{
    if(root==NULL)
    {
        return ;
    }

    cout<<root->data<<" ";
    preorder(root->left);
    preorder(root->right);
    return;
}
void postorder(node*root)
{
    if(root==NULL)
    {
        return ;
    }

    preorder(root->left);
    preorder(root->right);
     cout<<root->data<<" ";
    return;
}
void inorder(node*root)
{
    if(root==NULL)
    {
        return ;
    }

    preorder(root->left);
      cout<<root->data<<" ";
    preorder(root->right);

    return;
}
int main ()
{
    node*root=create_tree();
    cout<<"\nThe preorder traversal of tree is  ";
    preorder(root);
    cout<<"\nThe inorder traversal of tree is  ";
    inorder(root);
    cout<<"\nThe postorder traversal of tree  is  ";
    postorder(root);
    return 0;
}
