#include<iostream>
using namespace std;
int main()
{
 int n,c=0;;
  cin>>n;
  while(1)
  {
    cout<<n<<endl;
    c++;
    if(n==1)
      break;
    if(n%2==0)
      n = n/2;
    else 
      n = 3*n+1;   
  }
  cout<<c-1;
}