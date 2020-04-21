#include<iostream>
using namespace std;
int main()
{
  int r,c;
  int sum=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
   	for(int j=0;j<c;j++){
      cin>>a[i][j];
      if(i==0 || i==(r-1) || i==j)
        sum +=a[i][j];
    }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
    
}