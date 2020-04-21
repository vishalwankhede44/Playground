#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  int maxr[r];
  int maxc[c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        cin>>a[i][j];
      }
    }
  int mr=0;
   for(int i=0;i<r;i++){
     maxr[mr]=maxc[mr]=0;
      for(int j=0;j<c;j++){
        maxr[mr] += a[i][j];
        maxc[mr] += a[j][i];
      }
     mr++;
    }
  int maxrow=0,maxcol=0;
  cout<<"Sum of rows is ";
  for(int i=0;i<mr;i++)
  {
     if(maxr[maxrow]<maxr[i])
       maxrow=i;
     
    if(maxc[maxcol]<maxc[i])
      maxcol =i;
    
    cout<<maxr[i]<<" ";
  }
  
  cout<<"\nRow "<<maxrow+1<<" has maximum sum";
  cout<<"\nSum of columns is ";
  for(int i=0;i<mr;i++)
  {
    cout<<maxc[i]<<" ";
  }
    cout<<"\nColumn "<<maxcol+1<<" has maximum sum";
 
  
   
}