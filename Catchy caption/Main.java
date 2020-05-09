
#include <cstring>
#include <iostream>
#include<string>
using namespace std;

int main()
{
 string str;
  getline(cin,str);
  //cout<<str<<endl;
  if(str.length()<50)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   
}