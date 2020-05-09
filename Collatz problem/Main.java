#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int count = 0;
  cout<<n<<endl;
  while(n != 1){
  		if(n % 2 == 0){
          n = n/2;
          count++;
          	cout<<n<<endl;
        }
          else{
           n = (3*n) + 1;
            count++;
          cout<<n<<endl;
  }
}
  cout<<count;
}