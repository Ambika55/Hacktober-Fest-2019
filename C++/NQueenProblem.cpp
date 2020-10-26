#include<iostream>
using namespace std;

int no_of_sollutions=0;

bool isSafe(int board[][20],int i,int j,int n)
{
	//You can check for col
	for(int row=0;row<i;row++){
		if(board[row][j]==1){
			return false;
		}
	}

	//You can check for Left diagnal
	int x = i;
	int y = j;

	while(x>=0 && y<n){
		if(board[x][y]==1){
			return false;
		}
		x--;
		y--;
	}

	//You can check for the Right diagnal
	x = i;
	y = j;

	while(x>=0 && y>=0){
		if(board[x][y]==1){
			return false;
		}
		x--;
		y++;
	}

	//The position is safe to place the queen 
	return true;
}

bool solveNQueen(int board[][20],int i,int n)
{
	//base case
	if(i==n){
		//Printing the board
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(board[i][j]==1){
					cout<<"Q ";
				}
				else{
					cout<<"_ ";
				}
			}
			cout<<endl;

		}
		no_of_sollutions++;
		cout<<"-----------"<<endl;

		return false;
	}

	//recursive case
	for(int j=0;j<n;j++)
  {
		if(isSafe(board,i,j,n))
    {
			//Place the Queen assuming i,j is the right position
			board[i][j]=1;
			
			bool nextQueenCanBePlaced = solveNQueen(board,i+1,n);
			if(nextQueenCanBePlaced){
				return true;
			}
			board[i][j]=0;    //Backtrack
		}
	}
	//You have tried for all positions in the current rows but couldn't place a queen
	return false;
}

int main()
{
	int board[20][20]={0};
	int n;
	cin>>n;
	if(not(n>=1 and n<=11)){
		cout<<"Wrong input range"<<endl;
		return 0;
	}
	if(n==3||n==2)
  {
		cout<<"No format to set "<<n<<" queens on the board."<<endl;
		return 0;
	}
	solveNQueen(board,0,n);
	cout<<"No of solutions :"<<no_of_sollutions<<endl;
	return 0;

}
