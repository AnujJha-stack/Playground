/*
 * Pattern V
Write a program to print the trapezium pattern.
Sample Input:

4

Sample Output:

1*2*3*4*17*18*19*20
--5*6*7*14*15*16
----8*9*12*13
------10*11
 */
#include <iostream>

using namespace std;

int main()
{

    int i, j, l_term, r_term,ip,space;
    cin>>ip;
    // The terms on the LHS of the pattern  
    l_term = 1;

    // The terms on the RHS of the pattern 
    r_term = ip * ip + 1;

    for (i = ip; i > 0; i--) {

        // To print number of spaces  
        for (space = ip; space > i; space--)
            cout << "--";

        for (j = 1; j <= i; j++) {
            cout << l_term;
            cout << "*";
            l_term++;
        }
        for (j = 1; j <= i; j++) {
            cout << r_term;
            if (j < i)
                printf("*");
            r_term++;
        }

        // To get the next term on RHS of the Pattern  
        r_term = r_term - (i - 1) * 2 - 1;
        cout << endl;
    }
} 