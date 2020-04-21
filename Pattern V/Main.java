#include<iostream>
using namespace std;
int main()
{
   int r,n=0,s=1,d=0;
   cin>>r;
   for(int i=1;i<=r;i++)
     n += (i*2);
 
   for(int i=r;i>=1;i--)
   {
      for(int j=0;j<d;j++)
      {
         cout<<"-";
      }
     d=d+2;
      for(int j=s;j<(s+i);j++)
      {
        if(j==s)
    	  cout<<j; 
        else
          cout<<"*"<<j; 
      }
      s=s+i;
      for(int j=(n-i+1);j<=n;j++){
       
         
            cout<<"*"<<j;
       
      }
      n=n-i;
     cout<<endl;
   }
}