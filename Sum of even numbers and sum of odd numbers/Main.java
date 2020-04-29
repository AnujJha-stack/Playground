#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int n,odd_sum=0,even_sum=0;
  cin>>n;
  int *arr = (int*)calloc(n,sizeof(int));
  for(int i = 0; i < n; i++)
  {
    cin>>*(arr+i);
    if(*(arr+i)%2==0)//even
      even_sum+=*(arr+i);
    else//odd
      odd_sum+=*(arr+i);
  }
  cout<<"The sum of the even numbers in the array is "<<even_sum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<odd_sum;
}