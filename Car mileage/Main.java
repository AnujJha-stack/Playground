#include<iostream>
using namespace std;
int main()
{
  float mil;
  int rem_pt,dist;
  cin>>mil>>rem_pt>>dist;
  if(mil*rem_pt >= dist)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}