
public class EvaluateBoolExpression {

	public static void main(String[] args) {
		String str = "1C1B1B0A0" ;
		// A : AND, B : OR, C : XOR
		
		StringBuffer s = new StringBuffer(str) ;
		int n = s.length(); 
	       
        // Traverse all operands by jumping 
        // a character after every iteration. 
        for (int i = 0; i < n; i += 2) { 
            // If operator next to current operand 
            // is AND. 
            if( i + 1 < n && i + 2 < n) 
            { 
                if (s.charAt(i + 1) == 'A') { 
                    if (s.charAt(i + 2) == '0' ||  
                            s.charAt(i) == 0) 
                        s.setCharAt(i + 2, '0'); 
                    else
                        s.setCharAt(i + 2, '1'); 
                } 
           
                // If operator next to current operand 
                // is OR. 
                else if (s.charAt(i + 1 ) == 'B') { 
                    if (s.charAt(i + 2) == '1' || 
                          s.charAt(i) == '1') 
                        s.setCharAt(i + 2, '1'); 
                    else
                        s.setCharAt(i + 2, '0'); 
                } 
                  
                // If operator next to current operand 
                // is XOR (Assuming a valid input) 
                else { 
                    if (s.charAt(i + 2) == s.charAt(i)) 
                        s.setCharAt(i + 2, '0'); 
                    else
                        s.setCharAt(i + 2 ,'1'); 
                } 
            }
        } 
        System.out.print(s.charAt(n - 1) - '0'); 
	}

}
