#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int value=0;
  int key=6;
  int count=0;
  for(int i=1;i<=n;i++){
  	cout<<value<<" ";
    if(i==1)
      	value = value + 2;
    else{
       if(count<2){
      	 value = value + key;
    	count++;
       }
    	else{
           key = key + 4;
    		count = 1;
    		value = value + key;
        }
    } 
  }
}