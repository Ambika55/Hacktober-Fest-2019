import java.util.*;
import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
public class binarytree{
    public static class node{
        int data=0;
        node left;
        node right;

        node(int data,node left,node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static class diapair{
        int height;
        int diameter;
    }
    static node constructor(int []arr){
        LinkedList<node> st=new LinkedList<>();
        node root=null;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.removeFirst();
            }else{
                node nn =new node(arr[i],null,null);
                if(st.size()==0){
                    root=nn;
                }else{
                   node parent =st.getFirst();
                   if(parent.left==null){
                        parent.left=nn;
                   }else{
                        parent.right=nn;
                   }
                }
                st.addFirst(nn);
            }
        }
        return root;
    }
    static void display(node root){
        if(root==null){
            return;
        }
        String str="";
        str+=root.left!=null?root.left.data+"->":".->";
        str+=root.data;
        str+=root.right!=null?"<-"+root.right.data:"<-.";
        
        System.out.println(str);
        display(root.left);
        display(root.right);
    }
    static int size(node root){
        if(root==null){
            return 0;
        }
        int l1=size(root.left);
        int r1=size(root.right);

        return l1+r1+1;
    }
    static int maxelement(node root){
        if(root==null){
          return 0;
        }
        int lmax=maxelement(root.left);
        int rmax=maxelement(root.right);

        return Math.max(root.data,Math.max(lmax,rmax));
    }
    static int heightnode(node root){
      if(root==null){
          return 0;
      }
      int lh=heightnode(root.left);
      int rh = heightnode(root.right);
      return Math.max(lh,rh)+1;
    }
    static int heightedge(node root){
        if(root==null){
            return -1;
        }
        int lh=heightedge(root.left);
        int rh=heightedge(root.right);
        return Math.max(lh,rh)+1;
    }
    static boolean find(node root,int data){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        boolean lfi =find(root.left, data);
        if(lfi==true){
            return true;
        }
        boolean rfi =find(root.right, data);
        if(rfi==true){
            return true;
        }
        return false;
        }
        
   public static ArrayList<node> nodetorootpath(node root,int data){
       if(root ==null){
           return new ArrayList<>();
       }
         if(root.data==data){
             ArrayList<node> base=new ArrayList<>();
             base.add(root);
             return base;
         }
         ArrayList<node> l=nodetorootpath(root.left, data);
         if(l.size()>0){
             l.add(root);
             return l;
         }
         ArrayList<node> r=nodetorootpath(root.right, data);
         if(r.size()>0){
             r.add(root);
             return r;
         }
         return new ArrayList<>();
    }
   public static node ltd(node root){
        if(root==null){
            return null;
        }                                        
        root.left=ltd(root.left);
        root.right=ltd(root.right);
        root.left=new node(root.data,root.left,null);    //newnode should be made later otherwise 
                                                         //left part of root will be lost
        
        return root;

    }
    
      static void removeleave1(node root){
          if(root.left!=null){
              if(root.left.left==null&&root.left.right==null){
                  root.left=null;
              }else{
                  removeleave1(root.left);
              }
          }if(root.right!=null){
            if(root.right.left==null&&root.right.right==null){
                root.right=null;
            }else{
                removeleave1(root.right);
            }
          }   
      }
      static node removeleave2(node root){
          if(root.left!=null&&root.right!=null){
            root.left=removeleave2(root.left);
            root.right=removeleave2(root.right);
          }else if(root.left!=null){
            root.left=removeleave2(root.left);
          }else if(root.right!=null){
            root.right=removeleave2(root.right);
          }else{
              root=null;
          }
          return root;
      }
     static node tree(int[]pre,int psi,int pei,int []in,int isi,int iei){
         if(psi>pei||isi>iei){
             return null;
         }
         node root=new node(pre[psi], null, null);
         int f=0;
         for(int i=isi;i<=iei;i++){
         if(in[i]==pre[psi]){
            f=i;
            break;
         }  
         }
         int sz=f-isi;
         
         root.left=tree(pre, psi+1, psi+sz, in, isi, f-1);
         root.right=tree(pre, psi+sz+1, pei, in, f+1, iei);

         return root;
     }
     static node tree2(int[]post,int psi,int pei,int[]in,int isi,int iei){
         if(psi>pei||isi>iei){
           return null;
         }
         node root=new node(post[pei], null,null);
         int f=0;
         for(int i=isi;i<=iei;i++){
             if(in[i]==post[pei]){
                 f=i;
                 break;
             }
         }
         int sz=iei-f;
         root.left=tree2(post, psi, pei-sz-1, in, isi,f-1);
         root.right=tree2(post, pei-sz, pei-1, in, f+1, iei);
         return root;
        }
        public static class pair{
            int state=0;
            node node;
        
        public pair(int state,node node){
            this.state=state;
            this.node=node;
        }
    }
     static void iterativedft(node root){
         ArrayList<Integer> pre=new ArrayList<>();
         ArrayList<Integer> post=new ArrayList<>();
         ArrayList<Integer> in=new ArrayList<>();
         Stack<pair> st=new Stack<>();
         pair rtp =new pair(0,root);
         st.push(rtp);
         while(st.size()>0){
           pair top =st.peek();
           if(top.node==null){
               st.pop();
              continue;
           }
           if(top.state==0){
               pre.add(top.node.data);
               top.state+=1;
               pair np = new pair(0,top.node.left);
               st.push(np);
           }else if(top.state==1){
               in.add(top.node.data);
               top.state+=1;
               pair np=new pair(0,top.node.right);
               st.push(np);
           }else if(top.state==2){
               post.add(top.node.data);
               st.pop();
           }
         }
     System.out.println("pre  order ->"+pre);
     System.out.println("in   order ->"+in);
     System.out.println("post order ->"+post);
     }
static int diameter1(node root){
    if(root==null){
        return 0;
    }
  
    int ld = diameter1(root.left);
    int rd = diameter1(root.right);

    int htl = heightedge(root.left);            //acc to node 
    int htr = heightedge(root.right);
    int htt= htl+htr+2;                         //ht1+ht2+1

    return Math.max(htt,Math.max(ld,rd));
}

static diapair diameter2(node root){
       if(root==null){
           diapair bp = new diapair();
           bp.height=-1;
           bp.diameter=0;
           return bp;
       }
       diapair lp = diameter2(root.left);
       diapair rp = diameter2(root.right);
      
       diapair mp = new diapair();
       mp.height = Math.max(lp.height,rp.height)+2;
       mp.diameter= Math.max(mp.height,Math.max(lp.diameter,rp.diameter));

       return mp;
        
} 
public static  class balpair{
     boolean isbal;
     int ht;
}
static balpair isbalanced(node root){
    if(root==null){
        balpair bp = new balpair();
        bp.isbal =true;
        bp.ht = 0;
        return bp;
    }
    balpair lp = isbalanced(root.left);
    balpair rp = isbalanced(root.right);
    balpair mp = new balpair();
   
    mp.isbal= lp.isbal && rp.isbal && Math.abs(lp.ht-rp.ht)<=1;
    mp.ht = Math.max(lp.ht,rp.ht)+1;

    return mp;
}


    public static void main(String[]args){
        int []arr={50,25,12,-1,37,30,31,-1,40,-1,-1,-1,75,62,60,-1,70,-1,-1,87,-1,-1,-1};
        node root = constructor(arr);
       display(root);
         int sz = size(root);
         System.out.println("size ="+sz);
         int max = maxelement(root);
         System.out.println("max ="+max);
         int height1= heightnode(root);
         System.out.println("height 1 ="+height1);
         int height2= heightedge(root);
         System.out.println("height 2 ="+height2);
         boolean res=find(root, 40);
         System.out.println(res);
         ArrayList<node> res1=nodetorootpath(root, 40);
         for(node node:res1){
             System.out.print(node.data+" ");
         }
        //System.out.println();
        //removeleave1(root);
        //display(root);
        // node root2=removeleave2(root);
        // display(root2);   
        // node root3= ltd(root);
        // display(root3);
         int []pre = {50,25,20,30,60,70,75,40,80,100,45};
         int [] in = {20,25,60,30,70,50,80,40,100,75,45}; 
         int [] post={20,60,70,30,25,80,100,40,45,75,50};     
      node root3=tree(pre, 0,pre.length-1, in,0, in.length-1);
        node root4=tree2(post,0,post.length-1,in,0,in.length-1);
         display(root3);
       display(root4);
         iterativedft(root);
         int d1= diameter1(root);
         System.out.println(d1);
          diapair resp = diameter2(root);
          System.out.println(resp.height+" "+resp.diameter);
          balpair resp1 = isbalanced(root);
          System.out.println(resp1.ht);
          System.out.println(resp1.isbal);

    }
}
