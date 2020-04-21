#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  char s[100];
  cin.getline(s,100);
  int c=0;
  for(int i=0;s[i]!='\0';i++)
  {   
    if(s[i]==' ')
      c++;
  }
  if(c<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
   
}