import java.util.Stack;
import java.util.Scanner;

/*
This program constitutes of a function that uses Stacks implementation
to check for redundant brackets in an input string that's like a mathematical 
formula.
*/

public class redundantBrackets {
	
	public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String formula = s.nextLine();
        if(checkBalanced(input)) System.out.print(checkRedundantBrackets(formula)); //prints true if there are no redundant brackets.
        else System.out.print(false);
    }
    
    public static boolean checkRedundantBrackets(String input) {
		// Write your code here
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i)=='('){
                while(input.charAt(i)!=')'){
                    s.push(input.charAt(i));
                    s.peek();
                    i++;
                }
                if(input.charAt(i)==')'){
                    int meaningfulchars = 0;
                    while(s.peek()!='('){
                        s.pop();
                        meaningfulchars++;
                    }
                    if(meaningfulchars==0) return true;
                    s.pop();
                    i++;
                }
            }
        }
        return false;
	}

    public static boolean checkBalanced(String exp) {
		// Write your code here
        Stack<Character> braces = new Stack<>();
		for(int i = 0; i<exp.length();i++) {
			if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[') {
				braces.push(exp.charAt(i));
				
				//System.out.println(braces.peek());
			}
			else if(!braces.empty()) switch(exp.charAt(i)) {
			case ')':
				if(braces.peek()=='(') braces.pop();
				else return false;
				break;
			case '}':
				if(braces.peek()=='{') braces.pop();
				else return false;
				break;
			case ']':
				if(braces.peek()=='[') braces.pop();
				else return false;
				break;
			
//				if(exp.charAt(i)==')' || exp.charAt(i)==']' || exp.charAt(i)=='}') {
//				if(braces.peek()==exp.charAt(i)) braces.pop();
//				else return false;
			}
            else if(braces.empty()&&(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']')) return false;
		}
		if (braces.empty()) return true;
		else return false;
	}
}