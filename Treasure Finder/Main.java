#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,mid,hcf=1,pro;
  cin>>n1>>n2>>n3;
  if((n1>n2&&n1<n3)||(n1<n2&&n1>n3))
    mid=n1;
  else if((n2>n1&&n2<n3)||(n2<n1&&n2>n3))
    mid=n2;
  else if((n3>n1&&n3<n2)||(n3<n1&&n3>n2))
    mid=n3;
  pro=n1*n2*n3;
  for(int i=2;i<=pro;i++)
  {
    if(n1%i==0 && n2%i==0 && n3%i==0)
    {
      hcf=i;
      break;
    }
  } 
  cout<<"The treasure is in box which has number "<<mid;
  cout<<"\nThe code to open the box is "<<hcf;
}