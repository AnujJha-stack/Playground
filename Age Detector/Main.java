#include<iostream>
using namespace std;
int main()
{
  int lst_2d_by,lst_2d_ty;
  cin>>lst_2d_by>>lst_2d_ty;
  if(lst_2d_by==0)
    cout<<lst_2d_ty;
  else if(lst_2d_ty==0)
    cout<<100-lst_2d_by;
  else
  {
    if(lst_2d_by > lst_2d_ty)
      cout<<100-(lst_2d_by-lst_2d_ty);
    else
      cout<<lst_2d_ty-lst_2d_by;
  }
}