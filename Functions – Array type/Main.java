#include<iostream>
using namespace std;
int checkType(int *arr,int n)
{
   int e,o;
   e=o=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]%2==0)
          e++;
        else
          o++;
    }
   if(e>0 && o==0)
     return 0;
  else if(o>=0 && e==0)
     return 1;
  else 
    return 2;
    
      
}
int main()
{
  int n;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
    cin>>a[i];
  int op = checkType(a,n);
  if(op==0)
    cout<<"\nThe array is Even";
  else if(op==1)
    cout<<"\nThe array is Odd";
  else
    cout<<"\nThe array is Mixed";
}