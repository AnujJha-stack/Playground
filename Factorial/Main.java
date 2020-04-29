//Write a program to compute the factorial of a number using recursion.
#include <iostream>
using namespace std;
int fact(int n)
{
    if(n==1)
        return 1;
    return n*fact(n-1);

}
int main()
{
    int n;
    cin>>n;
    int res = fact(n);
    cout<<"The factorial of "<<n<<" is "<<res;
    return 0;
}