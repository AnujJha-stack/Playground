/*
 * Pattern 4
    Sample Input: 5

    Sample Output:
        11112
        32222
        33334
        54444
        55556
 */
#include <iostream>
using namespace std;
int main()
{
    int i,j,ip,count=0;
    cin>>ip;
    for(i = 1; i <= ip; i++)
    {
        for ( j = 1; j <= ip ; j++)
        {
            //odd
            if(i%2!=0)
            {
                if(j==1)
                    count++;
                if(j!=ip)
                    cout<<count;
                else
                    cout<<++count;
            }
            //even
            else
            {
                if(j==1)
                    cout<<++count;
                else
                {
                    if(j==2)
                        count--;
                    cout<<count;
                }

            }
        }
        cout<<endl;
    }
}