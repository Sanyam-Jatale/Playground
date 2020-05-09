#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int fact=1;
  
  for(int i=n;i>=1;i--){
  	fact = fact * i;
  }
  cout<<fact;
  
}