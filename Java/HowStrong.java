import java.io.* ;
public class HowStrong {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		String line = br.readLine();
		
		boolean hasUpperCase=false,hasLowerCase=false,hasDigit=false,hasSpecial=false  ;
		
		if(line.length()>=8) {
			for(int i=0 ; i<line.length() ; i++) {
				char x = line.charAt(i) ;
				if(Character.isLetter(x)) {
					if(Character.isUpperCase(x)){
						hasUpperCase = true ;
					}
					if(Character.isLowerCase(x)) {
						hasLowerCase = true ;
					}
				}else if(Character.isDigit(x)) {
					hasDigit = true ;
				}else {
					hasSpecial = true ;
				}
				
				if(hasUpperCase && hasLowerCase && hasDigit && hasSpecial) {
					break ;
				}
			}
			if(hasUpperCase && hasLowerCase && hasDigit && hasSpecial) {
				System.out.println("STRONG") ;
			}else {
				System.out.println("WEAK") ;
			}
		}else {
			System.out.println("Must be 8 characters long at least!") ;
		}
	}
}
