#include<iostream>
using namespace std;
int main()
{
  int r,c,max=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++){
      cin>>a[i][j];
       if(max<a[i][j])
         max=a[i][j];
    }
  cout<<"The maximum element is "<<max;
}