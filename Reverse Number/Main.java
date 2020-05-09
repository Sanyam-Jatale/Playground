#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int num;
  int i;
  cin>>num;
  
  int num1=0;
  while(num){
    
  	i = num%10;
    num = num/10;
    num1 = num1*10+i;
  }
  
  cout<<num1;
	return 0;
}