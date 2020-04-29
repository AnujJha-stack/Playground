#include<iostream>
using namespace std;
void swp(int &x, int &y)
{
  x=x^y;
  y=y^x;
  x=x^y;
}
int main()
{
  int x,y;
  cin>>x>>y;
  cout<<"Before swapping a= "<<x<<" and b="<<y;
  swp(x,y);
  cout<<"\nAfter swapping a= "<<x<<" and b="<<y;
}