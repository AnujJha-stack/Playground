#include <iostream>
using namespace std;
int main() 
{
  int num,rev=0,dig;
  cin>>num;
  while(num>0)
  {
    dig = num % 10;
    rev = (rev*10)+dig;
    num /= 10;
  }
  cout<<rev;
}