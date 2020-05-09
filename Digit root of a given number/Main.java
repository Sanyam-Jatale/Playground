#include<iostream>
using namespace std;

int sum_digit(int n)
{
   int sum = 0,temp=0;
	if(n <= 9)
      	return n;
  	
  	while(n)
    {
    	temp = n % 10;
      	sum = sum + temp;
      	n = n / 10;
    }
  	return sum_digit(sum);
}

int main()
{
	int n;
  	cin>>n;
  
  	cout<<sum_digit(n);
}