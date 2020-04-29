#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int age;
    float sh_tm,pr;
    cout<<setprecision(2)<<fixed;
    cin>>age>>sh_tm;
    if(age>=13)
    {
        pr=8.0;
        if(sh_tm==float(13.30))
            pr=5.0;
    }
    else
    {
        pr=4.0;
        if(sh_tm==(float)13.30)
            pr=2.0;
    }
    cout<<"$"<<pr;
}/*ms:13:30
  ns 10:15
  */