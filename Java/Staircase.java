import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int steps=staircase(n);
		System.out.println(steps);

	}

	private static int staircase(int n) {
		
		if(n==0)
		  return 1;
		if(n<=0)
			return 0;
		return staircase(n-1)+staircase(n-2)+staircase(n-3);
	}

}
