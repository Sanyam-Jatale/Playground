#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n],sum = 0;
  for(int i = 1;i<=n;i++) {
    cin>>a[i];
    sum+=a[i];
  }
  int max = n*m;
  if(max>sum)
  	cout<<m;
  else
    cout<<max/m;
}
