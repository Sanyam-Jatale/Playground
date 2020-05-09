#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int num;
  cin>>num;
  int count=0;
  
  do{
    num = num / 10;
    count++;
  }while(num);
  
  cout<<count;
}