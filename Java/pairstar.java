import java.util.Scanner;

public class pairstar {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		pairstar(str, "");

	}

	private static void pairstar(String str, String ans) {

		if (str.length() == 1) {
			System.out.println(ans+str.charAt(0));
			return;
		}
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		char ch1=str.charAt(0);
		char ch2=str.charAt(1);
		if(ch1==ch2)
		{
			pairstar(str.substring(2),ans+ch1+"*"+ch2);
		}
		else
			pairstar(str.substring(1),ans+ch1);

	}

}
