#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int items;
  float time;
  cin>>items>>time;
  
  switch(items){
    case 1: printf("%.2f",time);
      		break;
    case 2: printf("%.2f",(time+(float(time*50))/100));
      		break;
    case 3: printf("%.2f",2*time);
      		break;
      default : cout<<"Number of items is more";
      		break;
  }
}