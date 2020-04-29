#include<iostream>
using namespace std;
int main()
{
  int num,temp,i=0;
  cin>>num;
  temp=num;
  cout<<temp<<endl;
  while(temp!=1)
  {
    if(temp%2==0)
    {
      temp/=2;
      cout<<temp<<endl;
    }
    else
    {
      temp = 3*temp + 1;
      cout<<temp<<endl;
    }
    i++;
  }
  cout<<i;
}