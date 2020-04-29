#include<iostream>
using namespace std;
int main()
{
  float stval=0.5;
  int ip;
  cin>>ip;
  for(int i = 1; i <=ip; i++)
  {
    cout<<stval<<" ";
    stval*=3.0;
  }
}