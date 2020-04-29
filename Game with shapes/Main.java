#include<iostream>
using namespace std;
#define PI=3.14;
int main()
{
  int rad_cir,len_sq;
  cin>>rad_cir>>len_sq;
  ///if((PI*rad_cir*rad_cir <
  if(rad_cir*2 <= len_sq)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square"; 
}