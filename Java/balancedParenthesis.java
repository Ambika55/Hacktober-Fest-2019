package crux19aug;

import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scn = new Scanner(System.in);
			String str = scn.nextLine();
	        Stack<Character> s=new Stack<>();
			// StringBuilder sb=new StringBuilder(str);
			System.out.println(balance(str, 0, 0, 0,s));

		}

		public static boolean balance(String sb, int vidx, int count1, int count2,Stack<Character> s) {

			if (vidx == sb.length()) {

				if(s.isEmpty())
				return true;
				else
					return false;
			}

			char ch1 = sb.charAt(vidx);
			// char ch2=sb.charAt(vidx+2);

			if (ch1 == '{' || ch1 == '[' || ch1 == '(') {
				count1++;
				s.add(ch1);

			}
			if (ch1 == '}' || ch1 == ']' || ch1 == ')') {
				if(s.isEmpty())
					return false;
				char ch=s.pop();
			     if('{'!=ch && ch1=='}')
			    	 {
			    	 
			    	 return false;
			    	 }
			     else
			    	 if('['!=ch && ch1==']')
			    	 {
			    		 
			    		 return false;
			    	 }
			    	 else
			    		 if('('!=ch && ch1==')')
			    			 {
			    			 return false;
			    			 }
			    		 
			    		 
	        
			}

			boolean rr = balance(sb, vidx + 1, count1, count2,s);
			if(!rr)
				return false;
			else
				return true;
		}

	}
