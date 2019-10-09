import java.util.Scanner;

public class GeometricSum {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int k=scn.nextInt();
		double ans=sum(k);
		System.out.format("%.5f",ans );

	}

	private static double sum(int k) {
		
		if(k==0)
			return 1;
		
		return sum(k-1)+1/Math.pow(2, k);
		
	}

}
