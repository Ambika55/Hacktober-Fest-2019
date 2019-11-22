#include <stdio.h>
void main()
{   
    int a,num,sum=0;
printf("Enter any number\n");
scanf("%d",&num);
{
    while(num!=0)
    a=num%10;
    num/=10;
    sum=sum+a;

}
printf("The sum of digits of the given number is %d",sum);
}