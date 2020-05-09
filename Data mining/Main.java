#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,temp;
  cin>>num;
  temp= num;
  int i;
  int even=0,odd=0;
  while(temp){
  	i = temp%10;
    if(i % 2 == 0)
      	even+= i;
    else
      	odd+=i;
    temp = temp/10;
  }
  
  if(even == odd)
    cout<<"Yes";
  else
    cout<<"No";
}