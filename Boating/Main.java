#include<iostream>
using namespace std;
int main()
{
  int cap,num_ad,num_ch,wt_ad,wt_ch,wt_tot;
  //ad75
  //ch30
  cin>>cap>>num_ad>>num_ch;
  wt_ad=num_ad*75;
  wt_ch=num_ch*30;
  wt_tot=wt_ad+wt_ch;
  if(wt_tot<=cap)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}