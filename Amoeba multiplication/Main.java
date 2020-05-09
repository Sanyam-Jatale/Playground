#include<iostream>
using namespace std;

int fibo(int n){
  	
	if(n == 1)
      	return 0;
  	else if(n == 2)
      	return 1;
  else if(n == 3)
    	return 1;
  	else
  		return(fibo(n-1) + fibo(n-2));
}

int main()
{
  //Type your code here.
  int month;
  cin>>month;
  
  int x;
  x = fibo(month);
  cout<<x;
}