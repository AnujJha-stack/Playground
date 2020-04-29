#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int t=n,dig=0,sum=0;
  while(t)
  {
    dig++;
    t/=10;
  }
  t=n;
  int d;
  while(t)
  {
    d=t%10;
    sum+=power(d,dig);
    t/=10;
  }
  if(sum==n)
    return 1;
  else 
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}