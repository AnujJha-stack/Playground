#include<iostream>
using namespace std;
int main()
{
  int fp_amt, fp_dst,fp_shp_chg;
  int sp_amt, sp_dst,sp_shp_chg;
  int am_amt, am_dst,am_shp_chg;
  
  cin>>fp_amt>>fp_dst>>fp_shp_chg;
  cin>>sp_amt>>sp_dst>>sp_shp_chg;
  cin>>am_amt>>am_dst>>am_shp_chg;
  
  int fp=fp_amt-((fp_amt/100)*fp_dst)+fp_shp_chg;
  int sp=sp_amt-((sp_amt/100)*sp_dst)+sp_shp_chg;
  int am=am_amt-((am_amt/100)*am_dst)+am_shp_chg;

  cout<<"In Flipkart Rs."<<fp<<endl;
  cout<<"In Snapdeal Rs."<<sp<<endl;
  cout<<"In Amazon Rs."<<am<<endl;
  if(fp<=sp && fp<am)
    cout<<"He will prefer Flipkart";
  if(sp<fp && sp<am)
    cout<<"He will prefer Snapdeal";
  if(am<sp && am<fp)
    cout<<"He will prefer Amazon";
}