#include<iostream>
using namespace std;
#include<cstdlib>
int main(){
    int n,m_count=0,f_count=0;
    cin>>n;
    int *p = (int*)malloc(n*sizeof(int));
    for(int i = 0; i < n; i++){
        cin>>*(p+i);
        if(*(p+i) % 2 == 0)
            f_count++;
        else
            m_count++;
    }
    cout<<m_count<<endl<<f_count;
    return 0;
}