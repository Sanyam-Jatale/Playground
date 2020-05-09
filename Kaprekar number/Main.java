#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  
  cin>>num;
  
  int sq,temp;
  int digits=0;
  int k,n2,n1;
  sq = num*num;
  temp =sq;
  while(sq){
  	digits++;
    sq = sq/10;
  }
  
  if(digits % 2 !=0){
  	n2 = temp % int(pow(10,(digits%2)));
    n1 = temp / int(pow(10,(digits/2)));
    
  }
  else{
  	n2 = temp % int(pow(10,(digits/2)));
    n1 = temp / int(pow(10,(digits/2)));
  }
  
  k = n1 + n2;
  if(k == num)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}