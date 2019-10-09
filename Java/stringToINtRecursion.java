package crux19aug;

import java.util.Scanner;

public class stringToINtRecursion {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		System.out.println(integer(s,0));
		

	}

	private static int integer(String s,int ans) {
		if(s.length()==0)
			return ans;
		char ch=s.charAt(0);
		String ros=s.substring(1);
		int a=Integer.parseInt(ch+"");
		return integer(ros, ans*10+a);
		
		
		
	}

}
