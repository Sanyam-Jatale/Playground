#include<iostream>
using namespace std;

struct number{
	int real;
  	int comp;
};

int main()
{
	number n1 , n2 , n;
  	int x;
  	cin>>x;
  
  cin>>n1.real>>n1.comp>>n2.real>>n2.comp;
  	switch(x)
  {
      case 1: {
      			n.real = n1.real + n2.real;
        		n.comp = n1.comp + n2.comp;
        		break;
      }
        
        case 2: {
      			n.real = n1.real - n2.real;
        		n.comp = n1.comp - n2.comp;
        		break;
      }
        
        case 3: {
      			n.real = (n1.real*n2.real) - (n1.comp*n2.comp);
        		n.comp = (n1.comp*n2.real) + (n1.real*n2.comp);
        		break;
      }
      default: cout<<"Invalid choice";
        	return 0;
  }
  cout<<n.real;
  if(n.comp>=0)
    cout<<"+";
  cout<<n.comp<<"i";
}