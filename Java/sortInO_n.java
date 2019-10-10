package crux19aug;

import java.util.Scanner;

public class sortInO_n {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		int t=scn.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=scn.nextInt();
			int[] arr=new int[n];
			int start=scn.nextInt();
			int end=scn.nextInt();
			for(int j=0;j<n;j++)
				arr[j]=scn.nextInt();
			    sort(arr,start,end);
			
		}
		

	}

	private static void sort(int[] arr, int start, int end) {
		
		int[]sorted=new int[end+1];
		for(int i=0;i<arr.length;i++)
		{
			sorted[arr[i]]=sorted[arr[i]]+1;
			
		}
		
		for(int i=start;i<=end;i++)
		{
			while(sorted[i]!=0)
			{
				System.out.println(i);
				sorted[i]--;
			}
		}
	}

}
