#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int radius , len;
  cin>>radius>>len;
  
  if(2*radius == len)
    	cout<<"circle can be inside a square";
  else
    	cout<<"circle cannot be inside a square";
}