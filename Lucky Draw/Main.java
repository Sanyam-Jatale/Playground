#include<iostream>
using namespace std;

int main()
{
	int n;
  int i;
  	cin>>n;
  
   if(n <= 1)
      	cout<<"Not eligible";
  
  for(i=2;i<n;i++){
   
  	if(n%i == 0){
      	cout<<"Not eligible";
    	break;
    }
  }
  if(i == n)
    cout<<"Eligible";
}