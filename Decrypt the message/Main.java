#include<iostream>
using namespace std;

int main(){
	
  int enc_num;
  int num;
  
  cin>>enc_num>>num;
  int check = enc_num + num;
  int sum=0;
  int i=1;
  do{
  	if(check % i == 0)
    {sum = sum + i;}
    ++i;
  }while(i<check);
  
 	//cout<<sum<<"  "<<check;
  if(sum == check)
    	cout<<"They can read the message";
  else
    	cout<<"They can't read the message";
}