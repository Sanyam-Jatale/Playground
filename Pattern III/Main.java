#include<iostream>
using namespace std;

int main(){

  	int n;
  	cin>>n;
  
  	int i,j,k=1;
  	for(i=1;i<=n;i++)
    {
    	for(j=1;j<=i;j++)
        {
        	if(j==1){
              	cout<<k;
            }
          	else{
            	cout<<"*"<<k;
            }
        }
      	cout<<endl;
      k++;
      }
	k--;  
  
  	for(i=n;i>=1;i--)
    {
    	for(j=1;j<=i;j++)
        {
        	if(j==1){
              	cout<<k;
            }
          	else{
            	cout<<"*"<<k;
            }
        }
      	cout<<endl;
      k--;
      }
}