#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[50],b[50];
  cin>>a;
  cin>>b;
  if(!(strcmp(a,b)))
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}