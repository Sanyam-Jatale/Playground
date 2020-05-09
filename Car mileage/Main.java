#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int petrol, distance;
  cin>>mileage>>petrol>>distance;
  string str;
  str=(mileage >= float(distance)/petrol) ?"Can reach":"Cannot reach"; 
  cout<<str;
}