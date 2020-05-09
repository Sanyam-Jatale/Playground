#include<iostream>
using namespace std;

int main()
{
	int n;
  	cin>>n;
  	int i,j,k=1;
  
  	for(i=1;i<=n;i++)
    {
    		if(i%2 != 0)
            {
            	for(j=1;j<=i;j++)
                {
                	if(j==1){
                  		cout<<k;
                  		k++;
                    }
                  	else{
                      	cout<<"*"<<k;
                  		k++;
                }
                }  
              	cout<<endl;
            }
      		else{
            	k = k + (i-1);
            	for(j=1;j<=i;j++)
                {
                	if(j==1)
                    {
                    	cout<<k;
                      	k--;
                    }
                  	else{
                    
                    	cout<<"*"<<k;
                      	k--;
                    }
                  	
                }
              cout<<endl;
              	k = k + (i+1);
            }
    }
}