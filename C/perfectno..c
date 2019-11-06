
#include<stdio.h>
int main()
{
	long n,i;
	int sum=0;
	printf ("enter a no:");
	scanf("%ld",&n);
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	if(n==sum)
	{
		printf("perfect no.\n");
	}
    
	  else
	{
			printf("not perfect\n");
		}
	
	return 0;
}
