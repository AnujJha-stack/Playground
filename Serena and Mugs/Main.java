#include<iostream>
using namespace std;
int main()
{
    int num_mug,cup_vol;
    std::cin>>num_mug>>cup_vol;
    int mugs[num_mug];
    for(int i=0;i<num_mug;i++)
    {
        std::cin>>mugs[i];
    }
    int t=0;
    for(int i=0;i<num_mug;i++)
    {
        t=t+mugs[i];
    }
    if(t<=cup_vol)
        std::cout<<"YES";
    else
        std::cout<<"NO";
}