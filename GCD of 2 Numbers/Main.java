#include<iostream>
int Get_Small(int x, int y)
{
    if(x<y)
        return x;
    else
        return y;
}
int GCD(int x, int y, int small)
{
    if(x%small == 0 && y% small == 0)
        return small;
    else
        return GCD(x, y, small -1);


}
int main()
{
    int x,y;
    std::cin>>x>>y;
    int small=Get_Small(x,y);
    int res = GCD(x,y,small);
    std::cout<<"G.C.D of "<<x<<" and "<<y<<" = "<<res;
}