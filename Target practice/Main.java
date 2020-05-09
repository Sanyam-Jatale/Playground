#include<iostream>
using namespace std;
int main()
{
 int n,cnt = 0;
  int score;
  cin>>n;
  while(n>0) {
   cin>>score;
    n = n-score;
    cnt++;
  }
  cout<<"The number of turns is "<<cnt;
}
