package assignmentques;

import java.util.Arrays;
import java.util.Scanner;

public class Agressivecows {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		int nos = scn.nextInt();
		int noc = scn.nextInt();

		int[] arr = new int[nos];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		Arrays.sort(arr);

		int finalAns = 0;

		int lo = 0;
		int hi = arr[arr.length - 1] - arr[0];

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(nos, noc, arr, mid)) {
				finalAns = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}

		System.out.println(finalAns);

	}

	public static boolean isItPossible(int nos, int noc, int[] arr, int mid) {

		int cowsPlaced = 1;
		int lastCowPos = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] - lastCowPos >= mid) {

				cowsPlaced++;
				lastCowPos = arr[i];

				if (cowsPlaced == noc) {
					return true;
				}
			}

		}

		return false;

	}
}

