#include<stdio.h>
int main()
{
	int i,n,a=0,b=1,c;
	printf("enter a limit:");
	scanf("%d",& n);
	for(i=1;i<=n;i++)
	{
		printf("%d\n",a);
		c=a+b;
		a=b;
		b=c;
	}
	return 0;
	
}

