#include<iostream>
using namespace std;

int main()
{
	int n1,n2,n3,gcd;
  	cin>>n1>>n2>>n3>>gcd;
  
  	if(n1 % gcd == 0 && n2 % gcd == 0 && n3 % gcd == 0)
      	cout<<"Answer is correct.";
  	else
      cout<<"Answer is wrong.";
      	
}
