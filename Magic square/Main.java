#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r;
  cin>>r;
  int a[r][r];
  for(int i = 0;i<r;i++) {
   for(int j = 0;j<r;j++)
     cin>>a[i][j];
  }
  int sum1=0,sum2=0;
  for(int i = 0;i<r;i++) {
   for(int j = 0;j<r;j++) {
     if(i==j)
       sum1+=a[i][j];
     if(i+j==r-1)
       sum2+=a[i][j];
   }
  }
  //cout<<sum1<<" "<<sum2;
  if(sum1==sum2)
    cout<<"Yes";
  else
    cout<<"No";
}