#include <iostream>
#include<cmath>
using namespace std;
bool fun(int x,int y, int z)
{
    if(pow(x,y)>=z)
        return true;
}
int main()
{
    int x,y,z;
    cin>>x>>y>>z;
    if(fun(x,y,z))
        cout<<"Doctor, you can proceed with your experiment.";
    else
        cout<<"Sorry Doctor! You need more bacteria.";
}