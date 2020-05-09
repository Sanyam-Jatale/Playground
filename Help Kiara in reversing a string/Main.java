#include <iostream>
#include<string.h>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;
char c;    
//Your code goes here 
 
 cin.getline(str,100);
 while(str[count] != '\0')
 {
 	count++;
 }
  end = 0;
  //cout<<str<<endl;
for(i=count-1; i>=0 ; i--)
{
  	//cout<<strlen(str)<<endl;
	rev[end] = str[i];
  	end++;
}
  rev[end] = '\0';
  
 /* for(i=0;i<strlen(rev);i++)
  {
  	cout<<rev[i];
  }*/
  cout<<rev;
  return 0;
}