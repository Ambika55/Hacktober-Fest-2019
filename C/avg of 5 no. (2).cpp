#include <stdio.h>
int main()
{
	int i;int n;int sum=0; int arr[5];
	printf ("enter five no:");
	for(i=0 ;i<5;i++)
	{
	scanf("%d",&arr[i]);
    
    sum+=arr[i];
    	//sum=sum+arr[i];
    }
    n=sum/5;
	
	printf("avg no. is: %d" ,n);
	return 0;
	
		
}

