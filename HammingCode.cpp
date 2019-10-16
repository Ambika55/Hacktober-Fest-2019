#include<iostream>
#include<conio.h>
#include<math.h>

using namespace std;

int main()
{
	int m, n, i, j, k , s, c, r=1;
	char msg[10], hcode[20];
	
	cout<<"Enter the no. of message bits"<<endl;
	cin>>m;
	cout<<"Enter the message bits"<<endl;
	cin>>msg;
	
	while(!(m+r+1 <= pow(2,r)))
	{
		r++;		
	} 
	
	n=m+r;
	cout<<"Hamming code bits: "<<n<<endl;
	
	for(i=1, j=0, k=0; i<n, j<r, k<m; i++)
	{
		if(!(i==pow(2,j)))
		{
			hcode[i-1]=msg[k];
			k++;
		}
		else
		{
			hcode[i-1]='2';
			j++;
		}
	}
	
	cout<<"Hamming code = "<<hcode<<endl;
	cout<<"Enter 1 for odd parity and 0 for even parity"<<endl;
	cin>>c;
	
	//for 0 
	s=hcode[2]+hcode[4]+hcode[6];
	
	if(s%2==0)
	hcode[0]='0';
	
	else
	hcode[0]='1';
	
	//for 1
	s=hcode[2]+hcode[5]+hcode[6];
	
	if(s%2==0)
	hcode[1]='0';
	
	else
	hcode[1]='1';
	
	//for 2
	s=hcode[4]+hcode[5]+hcode[6];
	
	if(s%2==0)
	hcode[3]='0';
	
	else
	hcode[3]='1';
	
	cout<<"The resulting hamming code for even parity is: "<<hcode;
	
	
	getch();
	return 0;	
}
