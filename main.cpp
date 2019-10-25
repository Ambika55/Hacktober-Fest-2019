#include <iostream>

using namespace std;

int linearSearch(const int[], int, int);

int main()
{
    const int SIZE = 5;

    int tests[SIZE] = {86, 95, 100, 93};

    int results;

    results = linearSearch(tests, SIZE, 100);

    if(results == -1)
        cout << "Test score was below a 100 percent." << endl;
    else
    {
        cout << "Perfect score of 100 percent during test ";
        cout << (results + 1) << endl;
    }
    return 0;
}

int linearSearch(const int arr[], int size, int value)
{
    int index = 0;
    int position = -1;
    bool found = false;

    while (index < size && !found)
    {
        if (arr[index] == value)
        {
            found = true;
            position = index;
        }
        index++;
    }

    return position;
}