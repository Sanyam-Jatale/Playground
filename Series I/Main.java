#include<iostream>
using namespace std;

int main(){
	int n;
  float series = 0.5;
  cin>>n;
  
  for(int i =0 ; i<n ;i++){
  	cout<<series<<" ";
    series = series*2 + series;
  }
}