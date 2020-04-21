#include<iostream>
using namespace std;
int main()
{
  int n1=0,n2=1,n3,i,n,c=2;    
  cin>>n;
 for(i=2;i<n;++i) //loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;   
     c=n3;
  n1=n2;    
  n2=n3;
 }  
  cout<<"The term "<<n<<" in the fibonacci series is "<<c;
}