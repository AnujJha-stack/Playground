#include<iostream>
using namespace std;
int main()
{
  int p, t, r, interest;
  cin >> p;
  cin>>t;
  cin>>r;
  cout << (p*t*r)/100 << endl;
  cout<<((p*t*r)/100)+p<<endl;
  cout<<(p*t*r)/100*0.02<<endl;
  cout<<((p*t*r)/100+p)-((p*t*r)/100*0.02)<<endl;
  return 0;
}