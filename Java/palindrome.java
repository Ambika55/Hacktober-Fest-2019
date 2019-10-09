package crux19aug;
import java.util.Scanner;



public class palindrome {


       public static void main(String[] args) {
		
	
	    Scanner scn=new Scanner(System.in);
	    String str=scn.next();
	    
	    
          System.out.println(ispalindrome(str,0));
	    
	    
       }
	    
	    public static boolean ispalindrome(String str ,int pos)
	    {
	        
	        if (pos==str.length()/2)
	            return true;
	        
	        if (str.charAt(pos)!=str.charAt(str.length()-1-pos))
                return false;
	       
	        boolean rr= ispalindrome(str, pos+1);
	        if(!rr)
	        	 return false;
	        else
	        	return true;
	   }
}
