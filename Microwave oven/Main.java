#include<iostream>
using namespace std;
int main()
{
  int num_it;
  float per_it_heat_tm;
  cin>>num_it>>per_it_heat_tm;
  if(num_it==2)
  {
    per_it_heat_tm+=(per_it_heat_tm*.5);
    cout<<per_it_heat_tm;
  }
  else if(num_it==3)
  {
    per_it_heat_tm+=(per_it_heat_tm*1.0);
    cout<<per_it_heat_tm;
  }
  else
    cout<<"Number of items is more";
}