#include<bits/stdc++.h>
using namespace std;
void printPascal(int n)
{

	for (int line = 1; line <= n; line++)
	{ 
		int C = 1; 

		for (int i = 1; i < (n - line + 1); i++){
			cout << " ";
		}

		for (int i = 1; i <= line; i++)
		{

			cout << C << " ";
			C = C * (line - i) / i;
		}

		cout << "\n";
	}
}

int main()
{
	int n;	
	cin >> n;
	printPascal(n);
	return 0;
}