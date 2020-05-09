#include<iostream>
using namespace std;

int check(int n){
	int j=1;
  int sum=0;
  while(j<n){
  	if(n%j == 0)
      	sum = sum + j;
    j++;
  }
  return sum;
}

int main(){
	int r1,r2;
  	cin>>r1>>r2;
  
  for(int i = r1 ; i <=r2 ; i++){
  	int x = check(i);
    if(x == i)
      	cout<<x<<" ";
  }
}