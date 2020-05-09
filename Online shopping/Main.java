#include<iostream>
using namespace std;

int cost(int x,int y,int z)
{
	return((x-(x*y)/100) + z);
}

int main()
{
  //Type your code here.
  int f1,f2,f3,s1,s2,s3,a1,a2,a3;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  
  int flip,snap,amaz;
  flip=cost(f1,f2,f3);
  snap=cost(s1,s2,s3);
  amaz=cost(a1,a2,a3);
  
  cout<<"In Flipkart Rs."<<flip<<endl;
  cout<<"In Snapdeal Rs."<<snap<<endl;
  cout<<"In Amazon Rs."<<amaz<<endl;
  if(flip<=snap && flip<=amaz)
        cout<<"He will prefer Flipkart";
  else if(snap<=flip && snap<=amaz)
          cout<<"He will prefer Snapdeal";
  else
    	cout<<"He will prefer Amazon";
    
}