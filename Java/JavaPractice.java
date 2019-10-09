import java.util.Scanner;

public class JavaPractice
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();

		int item=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}

		
		//System.out.println(binarySearch(arr,item));
		System.out.println(readThePages(arr,item));
	}


	public static int binarySearch(int[] arr,int item)
	{
		int hi=arr.length-1;
		int lo=0;

		while(lo<=hi)
		{
            int mid=(lo+hi)/2;

            if(arr[mid]>item)
            {
            	hi=mid-1;
            }
            else
            	if(arr[mid]<item)
            	{
            		lo=mid+1;
            	}
            	else
            		return mid;
		}


		return -1;
	}

	public static int readThePages(int[] arr,int students)
	{
		int hi=0;
		int lo=arr[0];
		lo=arr[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			hi+=arr[i];


		}

		int finalans=0;
		while(lo<=hi)
		{
			int mid=(lo+hi)/2;

			if(ispossible(arr,students,mid))
			{
				finalans=mid;
				hi=mid-1;
			}
			else
				lo=mid+1;

		}

		return finalans;
	}

	public static boolean ispossible(int[] arr,int students,int mid)
	{

		int count=1;
		int pages=0;
        for(int i=0;i<arr.length;i++)
        {
            pages+=arr[i];
        	if(pages>mid)
        	{
        		pages=arr[i];
        		count++;
        	}
        	if(count>students)
        		return false;

        }


        return true;

	}
}