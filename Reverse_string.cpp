#include<iostream>
#include<string>
#include<cstring>
using namespace std;

int main()
{
    char Original_string[] = "Hello World";
    cout << "Original string: " << Original_string ;

    int len = strlen(Original_string);
    for (int i = 0; i < len / 2; i++)
    {
        char temp = Original_string[i];
        Original_string[i] = Original_string[len - 1 - i];
        Original_string[len - 1 - i] = temp;
    }

    cout << "\nReversed string: " << Original_string;

    return 0;
}

/**************OUTPUT
Original string: Hello World
Reversed string: dlroW olleH
*/
