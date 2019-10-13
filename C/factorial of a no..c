#include<stdio.h>
int main()
{
	int n ;int i;int fact=1;
	printf("Enter a no :");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
	   fact=fact*i;
	}
	
	printf("factorial of a given no:%d",fact);
	return 0;

	
	
}
