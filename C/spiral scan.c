#include<stdio.h>
int main()
{
	int n,m,i,j;
	printf("Rows and columns of the array\n");
	scanf("%d%d",&m,&n);
  int a[m][n];
  printf("Enter elements of the array\n");
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {scanf("%d",&a[i][j]);}
  }
int r=0,c=0,lastRow=m-1,lastCol=n-1;
while(r<=lastRow&&c<=lastCol)
	{
      for(i=r;i<=lastCol;i++)
      {
        printf("%d",a[r][i]);
      }
      r++;
      for(i=r;i<lastRow;i++)
      {
      printf("%d",a[i][lastCol]);	
      }
      lastCol--;
      for(i=lastRow;i>=c;i--)
      {
        printf("%d",a[lastRow][i]);
      }
      lastRow--;
      for(i=lastRow;i>=r;i--)
      {
        printf("%d",a[i][c]);
      }
      c++;	
	}
return 0;	
}
