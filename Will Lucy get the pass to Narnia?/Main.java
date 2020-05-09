#include<iostream>
using namespace std;
int main()
{
	int num1,num2,x;
  cout<<"Enter first number : ";
  cin>>num1;
  cout<<"Enter second number : ";
  cin>>num2;
  cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>x;
  
  switch(x){
  case 1:cout<<num1+num2;
  		break;
  case 2:cout<<num1-num2;
  		break;
  case 3:cout<<num1*num2;
  		break;
  case 4:cout<<num1/num2;
  		break;
  case 5:cout<<num1%num2;
  		break;
  default:cout<<"Invalid operation";
  		break;
  }
  return 0;
  
  
  
}