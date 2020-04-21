#include<iostream>
using namespace std;
int main()
{
 int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n+1];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  int pos,ele,t;
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>pos;
   if(pos>(n+1))
  { 
    cout<<"\nInvalid Input";
    return 0;
  }
   cout<<"\nEnter the value to insert";
  cin>>ele;
 
  for(int i=0;i<n;i++)
  {
     if(i!=pos)
       continue;
     else
     {
         for(int i=n;i>=pos;i--)
            a[i] = a[i-1];
         a[pos-1] = ele;
         break;
     }
  }
  cout<<"\nArray after insertion is"<<endl;
   for(int i=0;i<=n;i++)
   {
     cout<<a[i]<<endl;
   }
  
}