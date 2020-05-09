#include <iostream>
using namespace std;
int main() {
    // Type your code here
  	
  	int n;
  	cin>>n;
  
  	int i,j,k=0;
  
  	for(i=1;i<=n;i++)
    {
    	if(i%2 != 0){
        	k++;
          	for(j=1;j<n;j++)
            {
            	cout<<k;
            }
          	k++;
          cout<<k;
        }
        
      	else
        {
          	k++;
        	cout<<k;
          	k--;
          for(j=1;j<n;j++)
            {
            	cout<<k;
            }
        }
      cout<<endl;
    }
    return 0;
}