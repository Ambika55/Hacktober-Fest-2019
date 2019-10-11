#include<conio.h>
#include<stdio.h>
int main()
{
  int i,j,c=1;
  for(i=i;i<5;i++)
  {
    c=1;
    for(j=i;j<4;j++)
      printf(" ");
    for(j=0;j<(i+1);j++)
    {
      printf("%d",c);
      c++;

    }
    c--;
    for(j=0;j<i;j++)
    {
      c--;
      printf("%d",c);

    }
    printf("\n");
  }
  return 0;
}
