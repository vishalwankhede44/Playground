#include<iostream>
using namespace std;
int main()
{
	int s[7],t=0,sum=0;
  	for(int i=0;i<7;i++)
    {
    	cin>>s[i];
      	t += s[i];
    }
  	t=t-s[0]-s[6];
  	for(int i=1;i<6;i++)
    {
    	if(s[i]<=8)
          sum += s[i]*100;
      	else
          sum += s[i]*100+(s[i]-8)*15;
    }
  
  sum += s[0]*150;
  sum += s[6]*125;
  
  if(t>40)
  {
  	sum+=(t-40)*25;
  }
  cout<<sum;
 }