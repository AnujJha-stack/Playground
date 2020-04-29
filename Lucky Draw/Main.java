#include<iostream>
using namespace std;
int main()
{
  int num,flag=0;
  cin>>num;
  for(int i = 2 ; i <= num/2; i++)
  {
    if(num%i==0){
       flag = 1;
       break;
    }
  }
  
  if(flag==1 || num<2)
   {
       cout<<"Not eligible";
   }
   else
   {
       cout<<"Eligible";
   }
}