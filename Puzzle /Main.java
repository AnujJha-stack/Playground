#include<iostream>
using namespace std;
int r,c;
int main()
{
  cin>>r>>c;
  int mat1[r][c],mat2[c][r];;
  for(int i =0; i < r; i++)
    for(int j = 0; j < c; j++)
      cin>>mat1[i][j];
   for(int i = 0; i < r; i++){
     for(int j = 0; j < c; j++){
       mat2[j][i]=mat1[i][j];
     }
   }
   for(int i = 0; i < c; i++)
   {
     for(int j = 0; j < r; j++)
       cout<<mat2[i][j]<<" ";
     cout<<endl;
   }
 }