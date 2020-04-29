/*
 * Pattern
 * input=3
 * output:
 *
 * 3
 * 44
 * 555
 * 6666
 * 6666
 * 555
 * 44
 * 3
 *
 */
#include<iostream>
using namespace std;
int main()
{
    int ip;
    cin>>ip;
    for(int i  = 1; i <=4; ++i)
    {
        for (int j = 1; j <= i; ++j)
        {
            cout<<ip;
        }
        ip++;
        cout<<endl;
    }
    ip--;
    for(int i  = 1; i <=4; ++i)
    {
        for (int j = 1; j <= 5 - i; ++j)
        {
            cout<<ip;
        }
        ip--;
        cout<<endl;
    }
}