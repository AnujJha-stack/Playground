#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int ip,st=11,count=0;
  cin>>ip;
  while(count<ip)
  {
    cout<<pow(st,2)<<" ";
    st+=4;
    count++;
  }
}