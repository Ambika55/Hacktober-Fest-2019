package crux19aug;

import java.util.*;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 1;
		int nst = n / 2;
		int nsp = 0;
		int nsta = n / 2 ;
		while (row <= n) {
			for (int cst = 0; cst <= nst; cst++) {
				System.out.print("*" + "\t");
			}
			for (int csp = 1; csp <= nsp; csp++) {
				System.out.print(" " + "\t");
			}
			for (int cst = 0; cst < nsta; cst++) {
				System.out.print("*" + "\t");
			}
			// prep
			System.out.println();
			if (row <= n / 2) {
				nsp = 2*(row)-1;
				nst = nst - 1;
				if (row > 1)
					nsta -= 1;
			} else {
				nsp = nsp - 2;
				nst = nst + 1;
				if (row < n-1)
					nsta += 1;
			}
			row++;
		}

	}

}
