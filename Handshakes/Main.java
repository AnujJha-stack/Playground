#include<iostream>
using namespace std;
int main()
{
  int num,sum=0;
  cin>>num;
  for(int i = num; i > 0; i--)
  {
    sum +=  num - i;
  }
  cout<<sum;
}