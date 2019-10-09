#include<stdio.h>
int main()
{ 
     int n;int i;int count;
     printf("enter ano:");
     scanf("%d",&n);
    for (i=1;i<=n;i++)
    if(n%i==0)
    {
    	count++; 
    }
    	if(count==2)
    	printf("the no is prime");
        else
		printf("the no  is not a prime no");
		
	
	return 0;
	 
	 
}
