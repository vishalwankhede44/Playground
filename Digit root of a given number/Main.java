#include<iostream>
using namespace std;
int main(){
 int n,t,temp,s=0;
  cin>>n;
  while(n>0)
  {
     temp = n%10;
     t =t+temp;
    n=n/10;
  }
  while(t>0)
  {
      temp = t%10;
       t /=10;
       s = s+temp ;
  }
  cout<<s;
}