#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  int temp = num;
  int i;
  int sum= 0;
  
  while(temp){
  		i = temp % 10;
    	sum = sum + i;
    	temp = temp / 10;
  }
  
  if(num % sum == 0)
    	cout<<"Harshad Number";
  else
    	cout<<"Not Harshad Number";
}