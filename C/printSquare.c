#include<stdio.h>
 int main()
 {
     int i, j, r;
     printf("Enter number of rows : ");
     scanf(" %d",&r);
     for(i=0; i<r ; i++)
     {
         for( j=0; j<r; j++)
         {
             if((i==0)||(j==0)||(j==r-1)||(i==r-1))
                printf("* ");
             else
                printf("  ");
         }
         printf("\n");
     }
     return 0;
 }

