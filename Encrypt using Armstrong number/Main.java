#include<iostream>

int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
    int sum=0,temp=n;
  int temp1 = n;
  	int digits=0;
  while(n)
    {n = n/10;
     digits++;
    }
  
  	while(temp)
    {
    	n = temp%10;
      	temp = temp/10;
      	sum = sum+ (power(n,digits));
    }
  	//std ::cout<<sum;
  if(sum == temp1)
    	return 1;
  else
    	return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}