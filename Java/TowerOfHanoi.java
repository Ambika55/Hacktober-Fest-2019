import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class TowerOfHanoi {
 static int c=0;
    static int tower(int n,String src,String dest,String aux){ 
        if(n>0){
        tower(n-1,src,aux , dest );
            System.out.println("Move "+n+"th disc from "+src+" to "+dest);
            c++;
           tower(n-1,aux,dest ,src);
        
    }
   return c;
    }
    
    public static void main(String[] args) {
        
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         tower(n,"T1","T2","T3");
        System.out.print(c);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

