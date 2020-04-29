#include<iostream>
using namespace std;
int main()
{
  int r,c,num;
  cin>>r>>c>>num;
  if(num>=(r+1)&&num<=(2*r))
    cout<<"It is a mango tree";
  else if(num>=(((c-2)*r)+1)&&num<=((c-1)*r))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";

}