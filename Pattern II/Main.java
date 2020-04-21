#include<iostream>
using namespace std;
int main()
{
   int r,n=1,nc=0;
   cin>>r;
   for(int i=1;i<=r;i++)
   {
      if(i%2!=0)
      {
        for(int j=1;j<=i;j++)
        {
          if(j==1)
           cout<<n++;
          else
            cout<<"*"<<n++;
           
        }
        cout<<"\n";
      }
      else
      {
        for(int j=(n+(i-1));j>=i;j--)
        {
          if(j==n+(i-1))
             cout<<j;
          else
             cout<<"*"<<j;
           nc++;
           n++;
           if(nc==(i))
             break;
        }
              nc=0;
        cout<<"\n";
      }
   }
}