#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int y,flag=0;
  cin>>y;
  if(y%100!=0 && y%4==0)
    flag=1;
  if(y%400==0)
  {
    flag=1;
  }
  if(flag==1)
    cout<<y<<" is a leap year";
  else
    cout<<y<<" is not a leap year";
}