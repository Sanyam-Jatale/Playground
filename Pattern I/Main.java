#include<iostream>
using namespace std;

int main(){
	int n,i,j,k;
  	cin>>n;
    k = n;
  for(i=1;i<=4;i++){
  	for(j=1;j<=i;j++){
    	cout<<k;
    }
    k++;
    cout<<endl;
  }
  k--;
  for(i=3;i>=0;i--){
  	for(j=0;j<=i;j++){
    	cout<<k;
    }
    k--;
    cout<<endl;
  }
  
  
}