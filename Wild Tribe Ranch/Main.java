#include<iostream>
using namespace std;
int main()
{
  int w, max_w;
  cin>>w>>max_w;
  if(w>max_w)
    cout<<"Yes, you can enter.";
  else if(w==max_w)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
}