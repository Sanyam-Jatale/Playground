#include<iostream>
using namespace std;

int main()
{
  // Type your code here
  int n;
  cin>>n;
  int i;
  int arr[n];
  int meera;
  for(i=0;i<n;i++)
  {
  	cin>>arr[i];
  }
  
  cin>>meera;
  
  for(i=0;i<n;i++)
  {
  	if(arr[i] == meera){
      	cout<<"She passed her exam";
      	break;
    }
  }
  if(i == n)
    	cout<<"She failed";
  
}