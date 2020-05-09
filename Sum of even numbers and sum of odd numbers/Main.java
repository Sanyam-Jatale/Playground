#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int even = 0;
  int odd = 0;
  
  int arr[n];
  for(int i=0;i<n;i++)
  {
  	cin>>arr[i];
  }
  
  for(int i =0;i<n;i++)
  {
  	if(arr[i] % 2 == 0)
      even += arr[i];
    else
      odd += arr[i];
  }
  
  cout<<"The sum of the even numbers in the array is "<<even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<odd;
}