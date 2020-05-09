#include<iostream>
//#include<string>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  student s;
  int i;
  cin.get(s.name,50);
  cin>>s.roll;
  cin>>s.marks;
  cout<<endl<<"Student Details"<<endl;
  //cout<<"Name: "<<s.name<<endl;
  cout<<"Name: ";
  for(i=0;s.name[i] != '\0';i++)
  {
  	cout<<s.name[i];
  }
  cout<<endl;
  cout<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks;
  
  return 0;
}