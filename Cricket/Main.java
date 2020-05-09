#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int tballs,truns,run,ball;
  cin>>tballs>>truns>>run>>ball;
  
  float tovers=tballs/6;
  float over=ball/6 + float(ball%6)/10;
  float run_rate = round(run*10/over)/10;
  float trun_rate = float(truns)/tovers;
  
  cout<<tovers<<endl<<over<<endl<<run_rate<<endl<<setprecision(2)<<trun_rate<<endl;
  if(trun_rate<run_rate)
    	cout<<"Eligible to Win";
  else
    	cout<<"Not Eligible to Win";
    
}