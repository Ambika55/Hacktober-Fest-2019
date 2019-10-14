#include<stdio.h>
int main()
{
	int n,r,sum=0,temp;
	printf("enter a no:");
	scanf("%d",&n);
	temp=n;
	while(n>0)
	{
		r=n%10;
		sum =sum*10+r;
		n=n/10;
	}
	n=temp;
	if(n==sum)
	{
		printf("this no. is palindromic number");
	}
	else
	{
		printf(" this no. is not a palidromic number");
	}
	return 0;
	
}
