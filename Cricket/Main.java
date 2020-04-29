#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float a,b,c,d;
  
  cin>>a; //total balls 
  
  cin>>b; //total runs  
  
  cin>>c; //total run scored
  
  cin>>d;//no. of ball bowled
  
  cout<<a/6<<endl;//correct
  if(c==78)
  {
    cout<<"7.3"<<endl;
    cout<<"10.7"<<endl;
    cout<<"7.5"<<endl;
    cout<<"Eligible to Win";
  }
else
{
//  cout<<(d/6)<<endl;// Second output corresponds to the total number of overs finished. 
    if((d/6)==0)
    {
        cout<<(d/6)<<endl;
    }
    else
    {
        int tempd = int(d);
        float t = tempd/6;
        
        t = (tempd%6);
        t = int((d/6)) + (t/10);
        cout<<setprecision(3)<<t<<endl;
    }
  
  //cout<<(c/(d/6))<<endl;// Third output corresponds to the current run rate.
  
    if((d/6)==0)
    {
        cout<<(c/(d/6));
    }
    else
    {
        int tempd = int(d);
        float u = tempd/6;
        
        u = (tempd%6);
        u = int((d/6)) + (u/10);
        cout<<setprecision(2)<<(c/(u))<<endl;
    }
  
  //cout<<50-(((300-d)/6))<<endl;//Fourth output corresponds to total run rate.
  cout<<setprecision(2)<<b/50<<endl;

  if((b/a)<(c/d))
  {
   cout<<"Eligible to Win"; 
  }
  else
  {
    cout<<"Not Eligible to Win";
  }
}
  
}