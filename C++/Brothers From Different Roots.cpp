// https://practice.geeksforgeeks.org/problems/brothers-from-different-root/1
// Brothers From Different Roots
int countPairs(Node* root1, Node* root2, int x){
    if(!root1 || !root2)
        return 0;
    int ctr=0;
    stack<Node*> s1,s2;
    Node *t1,*t2;
    while(1){
        while(root1){
            s1.push(root1);
            root1=root1->left;
        }
        while(root2){
            s2.push(root2);
            root2=root2->right;
        }
        if(s1.empty() || s2.empty())
            break;
        t1=s1.top();
        t2=s2.top();
        if(t1->data+t2->data==x){
            ctr++;
            s1.pop();
            s2.pop();
            root1=t1->right;
            root2=t2->left;
        }
        else if(t1->data+t2->data<x){
            root1=t1->right;
            s1.pop();
        }
        else{
            root2=t2->left;
            s2.pop();
        }
    }
    return ctr;
}