#include<iostream>
using namespace std;

int getSmall(int x,int y,int z)
{
  if(x<y && x<z)
    return x;
  else if(y<x && y<z)
    return y;
  else
    return z;
}
int getGcd(int x, int y, int z)
{
  int small=getSmall(x,y,z);
  while(small)
  {
    if( (x % small == 0) && (y % small == 0) && (z % small == 0) )
    {
      return small;
    }
    small--;
  }
}
int main()
{
  int x,y,z,res;
  cin>>x>>y>>z>>res;
  int gcd = getGcd(x,y,z);
  if(gcd==res)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
} 