#include<iostream>
using namespace std;
int main()
{
 int a,c=0;
  float score=0;
  for(;;){
     cin>>a; 
    if(a>=0 && a%2==0)
       score -=0.5;
    else if(a>=0 && a%2!=0){
       score +=1;
       c++;
    }
    else if(a<0){
       score -=1;
       break;
    }
    if(c==3)
      break;
  }
  printf("%.1f",score);
 
}