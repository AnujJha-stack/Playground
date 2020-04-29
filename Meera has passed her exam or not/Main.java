#include<iostream>
using namespace std;
int main()
{
  int num,reg_num,flag=0;
  cin>>num;
  int cand[num];
  for(int i = 0; i<num; i++)
  {
    cin>>cand[i];
  }
  cin>>reg_num;
  for(int i = 0; i < num; i++)
  {
    if(cand[i]==reg_num)
    {
	  flag=1;
      break;
  	}
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  
}