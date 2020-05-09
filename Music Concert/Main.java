#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
	int *p;
  int male = 0;
	int i;
  
  p = (int *) calloc(n,sizeof(int));
  for(i=0;i<n;i++)
  {
  	cin>>*(p+i);
  }
  
  for(i=0;i<n;i++)
  {
  	if(*(p+i) % 2 != 0)
      	male++;
  }
  cout<<male<<endl;
  cout<<n - male;
    return 0;
}