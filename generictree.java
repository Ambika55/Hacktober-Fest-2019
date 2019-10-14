import java.util.*;
public class generictree{
   public static class node{
        int data=0;
        ArrayList<node> children =new ArrayList<>();

        node(int data){
        this.data=data;
        }
    }
  static  node constructor(int[]arr){
     LinkedList<node> st=new LinkedList<>();
     node root=null;
     for(int i=0;i<arr.length;i++){
        if(arr[i]==-1){
            st.removeFirst();
        }else{
         node nn = new node(arr[i]);
         if(st.size()==0){
           root =nn;
         }else{
          node parent = st.getFirst();
          parent.children.add(nn);
         }
         st.addFirst(nn);
        }
     }
     return root;
    }
   static void display(node root){
         System.out.print(root.data+ "->");
         for(node child:root.children){
             System.out.print(child.data+" ");
         }
         System.out.println();
         for(node child:root.children){
             display(child);
         }
    }
   static boolean find(node root,int data){
        if(root.data==data){
            return true;
        }
        for(node child:root.children){
            boolean res=find(child,data);
            if(res==true){
                return true;
            }
        }
        return false;
    }

      static int min (node root){
       int mino=root.data;
       for(node child: root.children){
           int recmin=min(child);
           mino=Math.min(mino,recmin);
       }
       return mino;
    }
    public static ArrayList<node> nodetorootpath(node root,int data){
          if(root.data==data){
              ArrayList<node> base=new ArrayList<>();
              base.add(root);
              return base;
          }
          for(node child:root.children){
              ArrayList<node> res=nodetorootpath(child, data);
              if(res.size()>0){
                  res.add(root);
                  return res;
              }
          }
          return new ArrayList<>();
    }
    public static int lca(int a,int b,node root){
       if(find(root,a)&&find(root,b)){
        ArrayList<node> res1=nodetorootpath(root,a);
        ArrayList<node> res2=nodetorootpath(root,b);
        for(int i=res1.size()-1,j=res2.size()-1;i>=0&&j>=0;i--,j--){
              if(res1.get(i).data!=res2.get(j).data){
                  return res1.get(i+1).data;                   
               }
               else if(i==0){
              return res1.get(i).data;
            }else if(j==0){
               return res2.get(j).data;
            }  
        }
        
       } 
       
      return -1;
    }
    public static void zigzag(node root){
        LinkedList<node> st1 = new LinkedList<>();
        LinkedList<node> st2 = new LinkedList<>();
        st1.addFirst(root);
        boolean flag=true;
        while(st1.size()>0){
            node rnode=st1.removeFirst();
            System.out.print(rnode.data+" ");
            if(flag==true){
               for(int i=rnode.children.size()-1;i>=0;i--){
                   st2.addFirst(rnode.children.get(i));
               }
            }else{
                for(node child:rnode.children){
                    st2.addFirst(child);
                }
            }
            if(st1.size()==0){
                System.out.println();
                LinkedList<node> temp=st1;
                st1=st2;
                st2=temp;
                flag=!flag;
            }

        }
    }
    /////17th august class
     public static class pair{
         int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
         boolean find =false;
         
     }
     static void multisolver(node root){
         if(pair.find==false){

         }
     }

public static void main(String []args){
    int [] arr ={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
    node root=constructor(arr);
    display(root);
    boolean res=find(root,40);
    System.out.println(res);
     System.out.println(min(root));
     System.out.println(lca(100,120,root));
    zigzag(root);
}
}
