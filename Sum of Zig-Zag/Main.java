#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  cin>>r;
  cin>>c;
  int a[r][c];
  for(int i =0;i<r;i++) {
   for(int j=0;j<c;j++)
     cin>>a[i][j];
  }
  int sum = 0;
  for(int i=0;i<r;i++) {
   for(int j = 0;j<c;j++) {
    if( i==0 || i==r-1 || i==j) {
        //cout<<a[i][j];
   		sum+=a[i][j];
    }
   }
  }
  
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}