#include<iostream>
using namespace std;
char itob(int , char *, int);
int main()
{
	int n,b;
	char s[20];
	cout<<"Enter an integer"<<endl;
	cin>>n;
	cout<<"Enter the base to convert integer"<<endl;
	cin>>b;
	itob(n,s,b);
	return 0;	
}

char itob(int n,char *s, int b)
{
	int p[32],i=0,j;
	if(b==16)
	printf("%x",n);
	else if(b==10)
	printf("%d",n);
	else if(b==8)
	printf("%o",n);
	else if(b==2)
	{
		while(n>0)
		{
			p[i] = n % 2;
			n=n/2;
			i++;		
		}
		for(j=i-1;j>=0;j--)
		{
			cout<<p[j];
		}
	}
}
