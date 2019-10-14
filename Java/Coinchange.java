package lect12backtracking;


import java.util.Scanner;

public class Coinchange {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = scn.nextInt();
		int[] denom = new int[n];
				for(int i =0;i<denom.length;i++)
					denom[i] = scn.nextInt();
		Coinchange(denom,a,0,"");
	}
	public static void Coinchange(int[] de,int a,int lp,String ans)
	{if(a==0)
	{System.out.println(ans);
	return;
	}
	if(a<0)
		return;
	for(int i= lp;i<de.length;i++)
	{
		Coinchange(de,a-de[i],i,ans+ de[i]);
	}
}
}
