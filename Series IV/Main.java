#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int num,res,flag=0,count=1;
    cin>>num;
    while(count<=num)
    {
        if(flag==0)
        {
            res=(int)pow(count,2)-1;
            flag=1;
            count++;
            cout<<res<<" ";
        }
        else
        {
            res=(int)pow(count,2)-2;
            flag=0;
            count++;
            cout<<res<<" ";
        }
    }
}
