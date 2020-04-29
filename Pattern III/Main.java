/*
 * Pattern 3
 * input : 5
Sample Output:

    1
    2*2
    3*3*3
    4*4*4*4
    5*5*5*5*5
    5*5*5*5*5
    4*4*4*4
    3*3*3
    2*2
    1
 */
#include<iostream>
using namespace std;
int main()
{
    int ip,i,j;
    cin>>ip;
    // upper half
    for(i = 1; i <= ip; i++)
    {
        for(j = 1 ; j <= i; j++)
        {
            if(j!=1)
                cout<<'*';
            cout<<i;
        }
        cout<<endl;
    }
    // lower half
    int temp=i-1;
    for(i = 1; i <= ip; i++)
    {
        for(j = 1 ; j <= ip + 1 - i; j++)
        {
            if(j!=1)
                cout<<'*';
            cout<<temp;
        }
        temp--;
        cout<<endl;
    }
}