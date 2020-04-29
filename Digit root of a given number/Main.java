/*
Write a program to find the repeated sum of digits of a number until it becomes a single-digit number.
Input Format:

The input contains an integer which denotes 'n'

Output Format:

Print the single digit number

Sample Input

88

Sample Output

7

Explanation:

Step 1: 8+8 = 16

Step 2: 1+6 = 7

sum of digits of a number until it becomes a single-digit number which is 7 here.
*/
#include<iostream>
using namespace std;
int R_sum(int x)
{
    int t1=x,dig=0,sum=0;
    while(t1)
    {
        dig++;
        t1/=10;
    }
    while(dig)
    {
        sum = sum + (x%10);
        x/=10;
        dig--;
    }
    if(sum<10)
    {
        return sum;
    }
    else
    {
        return R_sum(sum);
    }


}
int main()
{
    int ip,res;
    cin>>ip;
    if(ip<10)
    {
        cout<<ip;
        return 0;
    }
    else
    {
        res = R_sum(ip);
        cout<<res;
    }
}