#include<iostream>
using namespace std;

int power(int a,int n)
{
  	int value=1;
	for(int i =1 ; i<=n;i++)
    {
    	value = value * a;
    }
  return value;
}

int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}