#include<iostream>
using namespace std;

int main(){
	int n;
  int value=6;
  	cin>>n;
  int i;
  for(i=1;i<=n;i++){
  		cout<<value<<" ";
    	value = value + (5*i);
  }
}