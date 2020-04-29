#include<iostream>
using namespace std;
int main()
{
    int prev=0,cur=1,next,count,input;
    cin>>input;
    count=input;
    while(count-2 > 0)
    {
        next = prev+cur;
        prev=cur;
        cur=next;
        count--;
    }
    if(input==1)
        cout<<0;
    else if (input==2)
        cout<<1;
    else
        cout<<cur;
}