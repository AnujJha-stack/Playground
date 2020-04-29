#include<iostream>
int main(){
  int fact=1;
  int n;
  std::cin>>n;
  for(int i=2;i<=n;i++)
    fact*=i;
  std::cout<<fact;
}