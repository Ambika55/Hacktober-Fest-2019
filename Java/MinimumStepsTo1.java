import java.util.Scanner;

public class MinimumStepsTo1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		System.out.println(Minsteps(n));

	}

	private static int Minsteps(int n) {

		if (n == 1)
			return 0;

		// int r1 = 0, r2 = 0, r3 = 0;

		int r3 = Minsteps(n - 1);
		if (n % 2 == 0)
			r3 = Math.min(Minsteps(n / 2), r3);
		if (n % 3 == 0)
			r3 = Math.min(Minsteps(n / 3), r3);

		return r3 + 1;
	}

}
