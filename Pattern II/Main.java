/*
 * Pattern
 * input=5
 *
 * output:
 *
 *   1
 *   3*2
 *   4*5*6
 *   10*9*8*7
 *   11*12*13*14*15
 *
 */
#include<iostream>
using namespace std;
int main()
{
    int ip,count=1,temp=0;
    cin >> ip;
    for (int i = 1; i <= ip; ++i) {
        for (int j = 1; j <= i; ++j) {
            //if i is odd than normal flow
            if(i%2!=0){
                if(j!=1){
                    cout<<'*';
                }
                cout<<count++;
            }

            //if i is even than reverse flow
            else{
                if(j!=1){
                    cout<<'*';
                }
                if (j == 1){
                    count += i - 1;
                    temp = count;
                }

                cout<<temp;
                temp--;
                if(j==i)
                    count++;
            }
        }
        cout << endl;
    }
}