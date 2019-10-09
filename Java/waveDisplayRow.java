package crux19aug;

import java.util.Scanner;

public class waveDisplayRow {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] ar = takeInput();
		WaveDisplayRow(ar);
		// System.out.println(“END”);

	}

	public static int[][] takeInput() {

		int rows = scn.nextInt();
		int cols = scn.nextInt();

		int[][] arr = new int[rows][cols];

		for (int row = 0; row < arr.length; row++) {

			// update
			for (int col = 0; col < arr[row].length; col++) {

				// System.out.println(“{” + row + “-” + col + “}”);
				arr[row][col] = scn.nextInt();

			}
		}
		return arr;
	}

	public static void WaveDisplayRow(int[][] arr) {
	        for (int row = 0; row < arr.length; row++) {
	            if (row % 2 == 0) {
	                for (int col = 0; col < arr[0].length; col++) {
	                    System.out.print(arr[row][col] +",");

	                }
	            } else {
	                for (int col = arr[0].length - 1; col >= 0; col--) {
	                    System.out.print(arr[row][col] + ",");

	                }

	            }

	        }
	        System.out.println("END");
	    }

}
