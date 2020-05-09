#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,year;
  cin>>birth>>year;
  
  if(birth>year)
    	cout<<abs(birth-(100+year));
    else
      cout<<abs(birth-year);
}