#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,num;
  cin>>r>>c>>num;
  
  if((num>c) && (num<=r*2))
    	cout<<"It is a mango tree";
  else if(num>r*(c-2) && num<=r*(c-1))
    	cout<<"It is a mango tree";
  else
    	cout<<"It is not a mango tree";
}
