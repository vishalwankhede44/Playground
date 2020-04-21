#include<iostream>
using namespace std;
int main()
{
  int a[4],sum_d=0,sum_c=0;
  for(int i=0;i<4;i++){
  	cin>>a[i++];
    cin>>a[i];
    sum_d +=a[i-1];
    sum_c +=a[i];
  }  
  
  if(sum_c>100)
  {
    sum_d =sum_d + (sum_c/100);
     sum_c = sum_c%100;
  }
  cout<<sum_d<<endl;
  cout<<sum_c;
    
}