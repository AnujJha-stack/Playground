#include<iostream>
using namespace std;
int main()
{
  int num,sum_ev,sum_od;
  cin>>num;
  while(num)
  {
    int d=num%10;
    if(d%2==0)
    {
      sum_ev+=d;
    }
    else
    {
      sum_od+=d;
    }
    num/=10;
  }
  (sum_ev==sum_od)?cout<<"Yes":cout<<"No";
}