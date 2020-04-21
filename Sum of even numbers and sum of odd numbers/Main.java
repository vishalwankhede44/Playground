#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int n,even=0,odd=0;
  cin>>n;
  int *p = (int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(p+i);
     if((*(p+i))%2==0)
       even += (*(p+i));
     else
       odd += *(p+i);
  }
  cout<<"The sum of the even numbers in the array is "<<even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<odd;
}