// Adding Two numbers without '+' operator
#include <iostream> 
using namespace std; 

int Add(int x, int y) 
{ 
	while (y != 0) 
	{ 
		
		int carry = x & y; 
		x = x ^ y; 

		y = carry << 1; 
	} 
	return x; 
} 
int main() 
{ 
	int m,n;
	cout<<"Enter two numbers:";
	cin>>n>>m;
	cout << Add(m,n); 
	return 0; 
} 
