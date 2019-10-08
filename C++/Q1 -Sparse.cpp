//Sparse matrix implementation using arrays
#include<iostream>
using namespace std;
int main()
{
	int row,col;
	cout<<"Enter size of sparse matrix\n";
	cin>>row>>col;
	cout<<"Enter elements\n";
	int a[row][col];
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=col;j++)
		{
			cin>>a[i][j];
		}
	} 
	int count=0; 
		for(int i=1;i<=row;i++)  //counting non-zero ele
	{
		for(int j=1;j<=col;j++)
		{
		if(a[i][j]!=0)
		count++;
		}
	}
	int r[count],c[count],v[count];
	int k=0;
			for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
				{
					if(a[i][j]!=0)
						{
							r[k]=i;
							c[k]=j;
							v[k]=a[i][j];
							k++;
						}
				}
		}
		printf("Sparse matrix\n");
		
     
        for (int t=0; t<count; t++) 
         {
			   printf("\n ROW:%d ",r[t] ); 
   printf("\nCOL:%d ",c[t] ); 
    printf("\nVAL:%d ",v[t] ); 
        
    } 

    
	return 0;
}
