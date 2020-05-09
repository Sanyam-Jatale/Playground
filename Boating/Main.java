#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int boat;
  int ad,ch;
  cin>>boat>>ad>>ch;
  
  if(boat>(ad*75)+(ch*30))
    	cout<<"Boat is stable";
  else
    	cout<<"Boat will drow";
  return 0;
}