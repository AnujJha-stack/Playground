#include<iostream>
#include <math.h>
using namespace std;
int main()
{
    double n;
    cin >>n;
    double sz = 1/(sqrt(n));
    double add = 1/sz;
    cout<<int(n+add+1);
}