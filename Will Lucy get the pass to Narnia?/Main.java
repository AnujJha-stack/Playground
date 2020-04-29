#include<iostream>
using namespace std;
int main()
{
  int n1,n2,op;
  cout<<"Enter first number : ";
  cin>>n1;
  cout<<"Enter second number : ";
  cin>>n2;
  cout<<"Menu\n";
  cout<<"1.Addition"<<endl<<"2.Subtraction"<<endl<<"3.Multiplication"<<endl;
  cout<<"4.Division"<<endl<<"5.Remainder"<<endl;
  cin>>op;
  switch(op)
  {
    case 1:
      cout<<n1+n2;
      break;
	case 2:
      cout<<n1-n2;
      break;
	case 3:
      cout<<n1*n2;
      break;
	case 4:
      cout<<n1/n2;
      break;
	case 5:
      cout<<n1%n2;
      break;
    default:
      cout<<"Invalid operation";
      break;
  }
}