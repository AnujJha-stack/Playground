#include<iostream>
using namespace std;
int main()
{
  int prev=6,next=0,ip;
  cin>>ip;
  cout<<prev<<" ";
  for(int i=1;i<ip;i++)
  {
    next=prev+(5*i);
    cout<<next<<" ";
    prev=next;
  }
  
 
}