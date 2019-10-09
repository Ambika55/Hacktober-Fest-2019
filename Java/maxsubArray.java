package crux19aug;

import java.util.*;

public class maxsubArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int T = scn.nextInt();
		TestCases(T);
	}

	public static void TestCases(int T) {
		while (T > 0) {
			int N = scn.nextInt();
			int[] arr = takeinput(N);
			subsets(arr);
			T--;
		}
	}

	public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void subsets(int[] arr) {
		int sum = 0;
		int maxsumofsubarray = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			// ArrayList<Integer> list = new ArrayList<>();
			// list.add(arr[i]);
			sum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				// list.add(arr[j]);
				sum = sum + arr[j];
				if (sum > maxsumofsubarray) {
					maxsumofsubarray = sum;
					}
			}
		}
		System.out.println(maxsumofsubarray);

	}
}
