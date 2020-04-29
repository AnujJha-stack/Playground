#include<iostream>
using namespace std;
int main()
{
    string str;
    
    getline(cin, str);
  int a;
  cin>>a;
  if((str =="front") )
  {
    {
      if(a==1)
      {
    	cout<<"Left Handed";
      }
      else
      {
        cout<<"Right Handed";
      } 
    }
  }
  else
  {
    if(a==1)
    {
    	cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }

}