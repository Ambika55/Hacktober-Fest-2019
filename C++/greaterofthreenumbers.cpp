#include <iostream>
using namespace std;
int main()
{    
    float x1, x2, x3;
    cout << "Enter first number: ";
    cin >> x1;
    cout << "Enter Second number: ";
    cin >> x2 ;
    cout << "Enter third number: ";
    cin >> x3;
    if(x1 >= x2 && x1 >= x3)
    {
        cout << "Largest number: " << x1;
    }
    if(x2 >= x1 && x2 >= x3)
    {
        cout << "Largest number: " << x2;
    }
    if(x3 >= x1 && x3 >= x2) {
        cout << "Largest number: " << x3;
    }
    return 0;
}