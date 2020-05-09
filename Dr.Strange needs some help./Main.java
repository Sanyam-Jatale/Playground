#include<iostream>
using namespace std;

int mult(int m, int n)
{
	int i,j=1;
  	for(i=1;i<=n;i++)
    {
    	j = j*m;
    }
  return j;
}

int main()
{
	int m,n,req;
  	cin>>m>>n>>req;
  
  	int bact = mult(m,n);
  	if(req<=bact)
      	cout<<"Doctor, you can proceed with your experiment.";
  	else
      	cout<<"Sorry Doctor! You need more bacteria.";
}