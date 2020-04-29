#include<iostream>
using namespace std;

int getMax(const int arr[],int n)
{
    int max=arr[0];
    for(int i = 0; i < n; i++)
    {
        if(max<arr[i])
            max=arr[i];
    }
    return max;
}
int main()
{
    int n;
    cin>>n;
    int arr[n],sum=0;
    for(int i = 0; i < n; i++)
    {
        cin>>arr[i];
        sum+=arr[i];
    }
    int max = getMax(arr,n);
    cout<<max;
}