#include<iostream>
using namespace std;
int main()
{
    int low,high,num;
    cin>>low>>high;
    for(num=low;num<=high;num++)
    {
        int sum=0;
        for(int i=1; i<= num/2; i++)
        {
            if(num%i==0)
            {
                sum += i;
            }
        }
        if(num==sum)
            cout<<num<<" ";
    }

}