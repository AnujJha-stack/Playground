#include<iostream>
using namespace std;
int main()
{
  int uc;
  float ex=0,rt,tot_chg;
  cin>>uc;
  if(uc<=200)
  {
    rt=0.5;
  }
  else if(uc<=400)
  {
    rt=0.65;
    ex=100;
  }
  else if(uc<=600)
  {
    rt=0.80;
    ex=200;
  }
  else if(uc>600)
  {
    rt=1.25;
    ex=425;
  }
  tot_chg=ex+(rt*uc);
  cout<<"Rs."<<(int)tot_chg;
}