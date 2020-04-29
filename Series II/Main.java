#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int i;
  cin>>i;
  int stVal=11,gap=4,count=0;
  for(int j = stVal; count<i; count++)
  {
    cout<<pow(stVal,2)<<" ";
  	stVal+=gap;
  }
}