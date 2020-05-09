#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c;
  cin>>r>>c;
  int i,j;
  int mat[r][c];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	cin>>mat[i][j];
    }
  }
  
    for(i=0;i<c;i++)
  {
  	for(j=0;j<r;j++)
    {
    	cout<<mat[j][i]<<" ";
    }
     cout<<endl;
  }
}