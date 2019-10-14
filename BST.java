import java.util.*;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import javafx.print.Printer.MarginType;
public class bstrev1{
    public static class node{
        int data;
        node left;
        node right;

        node(int data,node left,node right){
            this.data=data;
            this.left = left;
            this.right= right;
        }
    }

    static node constructor(int [] arr){
     Stack<node> st = new Stack<>();
     node root = new node(0, null, null);
     for(int i=0;i<arr.length;i++){
         if(arr[i]==-1){
             st.pop();
         }else{
             node nn = new node(arr[i], null,null);
             if(st.size()==0){
                root = nn;
             }else{
              node pd = st.peek();
              if(pd.left==null){
                 pd.left=nn;
              }else{
                 pd.right = nn;
              }
             }
             st.push(nn);
         }
     }
     return root;
    }
    static void display(node root){
    if(root==null){
        return;
    }
    String str ="";
    str+=root.left!=null?root.left.data+"->":".->";
    str+=root.data;
    str+=root.right!=null?"<-"+root.right.data:"<-.";
    System.out.println(str);
    display(root.left);
    display(root.right);
    }
    static int dia=0;
    //this method is called return and impact method
    static int heightfordia(node root){
        if(root ==null){
            return 0;
        }
        int lh= heightfordia(root.left);
        int rh = heightfordia(root.right);
        if(lh+rh+1>dia){
           dia = lh+rh+1;
        }
        return Math.max(lh, rh)+1;
    }
    static boolean isbal = true;
    static int heightforbal(node root){
        if(root ==null){
            return 0;
        }
        int lh= heightforbal(root.left);
        int rh = heightforbal(root.right);
        if(Math.abs(lh-rh)>1){
            isbal=false;
        }
        return Math.max(lh,rh)+1;
    }
    public static class bstpair{
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean isbst;
        node lbstroot;
        int lbstsize;
    }
    static bstpair isbstree(node root){
        if(root == null){
            bstpair bp = new bstpair();
            bp.isbst= true;
            bp.lbstroot= null;
            bp.lbstsize=0;
            return bp;
        }
        bstpair lp = isbstree(root.left);
        bstpair rp = isbstree(root.right);
        bstpair mp = new bstpair();
        mp.min=Math.min(root.data,Math.min(lp.min,rp.min));
        mp.max=Math.max(root.data,Math.max(lp.max,rp.max));
        mp.isbst=lp.isbst&&rp.isbst&&(root.data>lp.max)&&(root.data<rp.min);
        if(mp.isbst){
            mp.lbstroot=root;
            mp.lbstsize=lp.lbstsize+rp.lbstsize+1;
        }else 
             {
                 if(lp.lbstsize>rp.lbstsize){
                  mp.lbstroot=lp.lbstroot;
                  mp.lbstsize=lp.lbstsize; 
             }else{
                mp.lbstsize=rp.lbstsize;
                mp.lbstroot=rp.lbstroot;
            }
    }
    return mp;
}

static void printkdown(node tnode,int k,node blocker){
    if(tnode==null||k<0||tnode==blocker){
        return;
    }
    if(k==0){
        System.out.println(tnode.data);
        return;
    }
    printkdown(tnode.left,k-1,blocker);
    printkdown(tnode.right,k-1,blocker);

}
static ArrayList<node> nodetoroot(node root,int data){
    if(root==null){
        return new ArrayList<>();
   }
    if(root.data==data){
      ArrayList<node> bres= new ArrayList<>();
      bres.add(root);
      return bres;
    }
    
    ArrayList<node> nodetorootleft=nodetoroot(root.left, data);
    if(nodetorootleft.size()>0){
         nodetorootleft.add(root);
         return nodetorootleft;
    }
    ArrayList<node> nodetorootright=nodetoroot(root.right, data);
    if(nodetorootright.size()>0){
         nodetorootright.add(root);
         return nodetorootright;
    }
    return new ArrayList<>();
}
static void printkfar(node root,int data,int k){
    ArrayList<node> path=nodetoroot(root,data);
    printkdown(path.get(0), k,null);
    for(int i=1;i<path.size();i++){
        printkdown(path.get(i), k-i,path.get(i-1));
    }
}
    
    public static void main(String[]args){
    int [] arr = {50,25,12,-1,37,30,-1,51,-1,-1,-1,75,62,60,55,-1,61,-1,-1,70,65,-1,78,-1,-1,-1,87,80,-1,90,-1,-1,-1,-1};
    node root = constructor(arr);
    display(root);
     int ht1= heightfordia(root);
     int ht2=heightforbal(root);
     System.out.println(isbal);
     System.out.println(dia);
     bstpair resp= isbstree(root);
     System.out.println(resp.lbstroot.data);
     System.out.println(resp.max);
     System.out.println(resp.min);
     System.out.println(resp.lbstsize);
    System.out.println(resp.isbst);
    printkfar(root,62,3 );
    }
}
