#include<iostream>
using namespace std;
int main()
{
    int r,c;
    cin>>r>>c;
    int a[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        cin>>a[i][j];
  
  for(int i=0;i<c;i++){
      for(int j=0;j<r;j++){
        cout<<a[j][i]<<" ";
      }
     cout<<"\n";
 }
}
