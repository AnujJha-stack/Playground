#include<iostream>
using namespace std;
int main()
{
  int x,res=0;
  cin>>x;
  res=x%10;
  res+=x/1000;
  cout<<res;
}