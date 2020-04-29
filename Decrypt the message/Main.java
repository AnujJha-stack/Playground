#include<iostream>
using namespace std;
int main()
{
    int num_def,num_ter;
    cin>>num_def>>num_ter;
    int num= num_def+num_ter,sum=0;
    for(int i=1; i<= num/2; i++)
    {
        if(num%i==0)
        {
            sum += i;
        }
    }
  if(sum == num)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}
