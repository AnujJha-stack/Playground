#include<iostream>
using namespace std;
int main()
{
  int num, sum=0, dig;
  cin>>num;
  int temp = num;
  while(temp>0)
  {
    dig = temp%10;
    temp/=10;
    sum+=dig;
  }
  if(num%sum == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";

}