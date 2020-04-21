#include<iostream>
#include<algorithm> 

using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;

  int maxn=max({a,b,c});
  int minn=min({a,b,c});
    
  if(a!=maxn&&a!=minn)
    cout<<"The treasure is in box which has number "<<a;
  else if(b!=maxn&&b!=minn)
    cout<<"The treasure is in box which has number "<<b;
  else
    cout<<"The treasure is in box which has number "<<c;

   if(a%b==0&&c%b==0)
  	cout<<"\nThe code to open the box is "<<b;
   else if(a%c==0&&b%c==0)
     cout<<"\nThe code to open the box is "<<c;
   else if(b%a==0 && c%a==0)
     cout<<"\nThe code to open the box is "<<a;
  else
         cout<<"\nThe code to open the box is 1";

}