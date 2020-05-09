#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50],b[50];
  cin>>a;
  cin>>b;
  int l=strlen(a);
  
  int m=strlen(b);
  int n=m-1,i;
  for(i=0;i<(m/2);i++)
  {
    swap(b[i],b[n]);
    n=n-1;
  }
  if(!(strcmp(a,b)))
  {
    cout<<"It is correct";
  }
  else
    cout<<"It is wrong";
}