#include<iostream>

 
using namespace std;
class matrix{
    private:
     int m, n, c, d ,first[2][2],second[2][2], res[2][2];
     int m2,n2;
 
    public :
    void getmatrixfirst(){
   cout << "Enter the number of rows and columns of matrix of 1st";
   cin >> m >> n;
   cout << "Enter the elements of first matrix\n";
   
   for (  c = 0 ; c < m ; c++ ){
      for ( d = 0 ; d < n ; d++ ){
         cin >> first[c][d];
      }
   }
    }
    void getsecondmatrix(){
         cout << "Enter the number of rows and columns of 2nd matrix ";
   cin >> m2 >> n2;
   cout << "Enter the elements of second matrix\n";
   for ( c = 0 ; c < m2 ;c++ ){
      for ( d = 0 ; d < n2 ; d++ ){
            cin >> second[c][d];
            }
   }
   
    }
   void getaddmat(){
   
   for ( c = 0 ; c < m ; c++ )
      for ( d = 0 ; d < n ; d++ )
         res[c][d] = first[c][d] + second[c][d];
 
   cout << "sum of entered matrices:-\n";
 
   for ( c = 0 ; c < m ; c++ )
   {
      for ( d = 0 ; d < n ; d++ )
         cout << res[c][d] << "\t";
 
      cout << endl;
   }
 
   }
   void getsubtr(){
       for ( c = 0 ; c < m ; c++ )
      for ( d = 0 ; d < n ; d++ )
         res[c][d] = first[c][d] - second[c][d];
 
   cout << "subtraction of entered matrices:-\n";
 
   for ( c = 0 ; c < m ; c++ )
   {
      for ( d = 0 ; d < n ; d++ )
         cout << res[c][d] << "\t";
 
      cout << endl;
   }
 
   }
   void gettranspose(){
       for ( c = 0 ; c < m ; c++ ){
      for ( d = 0 ; d < n ; d++ ){
         res[c][d] = first[d][c] ;
      }
       }
 
   cout << "transpose of entered matrices:-\n";
 
   for ( c = 0 ; c < m ; c++ )
   {
      for ( d = 0 ; d < n ; d++ )
         cout << res[c][d] << "\t";
 
      cout << endl;
   }
 
   }
   void getmult(){
    
       for ( c = 0 ; c < m ; c++ ){
      for ( d = 0 ; d < n2 ; d++ ){
          res[c][d]=0;
          for(int k=0;k<n2;k++){
         res[c][d] += first[c][k] * second[k][c];
          }
      }
       }
 
   cout << "multiplication of entered matrices:-\n";
 
   for ( c = 0 ; c < m ; c++ )
   {
      for ( d = 0 ; d < n2 ; d++ )
         cout << res[c][d] << "\t";
 
      cout << endl;
   }
 
   }
   
   
};
 
int main(int argc,char** argv)
{ matrix m1;
m1.getmatrixfirst();
m1.getsecondmatrix();
m1.getaddmat();
m1.getsubtr();
m1.gettranspose();
m1.getmult();

  
 
   
}
