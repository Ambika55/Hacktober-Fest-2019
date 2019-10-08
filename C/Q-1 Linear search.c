//Linear search
#include<stdio.h>
int main()
{
	int n,i,x;
	printf("Enter size of array\n");
	scanf("%d",&n);
		int a[n];
		printf("Enter elements\n");
		for(i=0;i<n;i++)
		scanf("%d",&a[i]);
		printf("Enter no. to be searched");
		scanf("%d",&x);
         for(i=0;i<n;i++)
         {
         	if(a[i]==x)
         	printf("No. found at position no : %d",i+1);
         	
         
		 }
		 	
		 return 0;
}
