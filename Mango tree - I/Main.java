#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  int num;
  cin>>r>>c>>num;
  
  if(num%r == 1){
  	cout<<"Yes";
  }
  else if(num > 0 && num <= c){
  	cout<<"Yes";
  }
  else if(num >r*(c-1) && num <= r*c){
  	cout<<"Yes";
  }
  else{
  	cout<<"No";
  }
}