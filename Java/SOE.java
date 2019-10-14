package timeandSpace;

import java.util.ArrayList;
import java.util.Arrays;

public class SOE {

	public static void main(String[] args) {
		//SOE(50);
	//	System.out.println(power(4,2));
		//System.out.println(stringin("a1B2"));
	}
	
	public static void SOE(int n)
	//complexity= O(n(logn)(loglogn)) 
	{
		boolean[] primes= new boolean[n+1];
		
		Arrays.fill(primes, true);
		
		primes[0]=primes[1]= false;
		
		for(int table=2; table*table<=n; table++)
		{
			if(primes[table]==false)
			{
				continue;
			}
			for(int mul=2; mul*table<=n; mul++)
			{
				primes[table*mul]=false;
			}
		}
		
		for(int i=0; i<primes.length; i++)
		{
			if(primes[i])
			System.out.println(i);
		}
	}
	public static int power(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		int rr= power(x, n/2);
		if(n%2==0)
		{ 			return rr*rr;
		}
		else
		{
			return rr*rr*x;
		}
		
	}
	

	
	

}


//if num of calls=1: num of fn frames*self work in each frame
//if num of calls>=2: (num of fn frames^height of rec tree)* self work


