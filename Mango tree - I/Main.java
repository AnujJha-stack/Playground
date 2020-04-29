#include<iostream>
using namespace std;
int main()
{
  int r,c,tr_num;
  cin>>r>>c>>tr_num;
  if(tr_num>1 && tr_num<(r+c-1+r-1))
    cout<<"Yes";
  else
    cout<<"No";
}