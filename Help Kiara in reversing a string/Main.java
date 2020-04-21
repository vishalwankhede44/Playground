#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int j=0, end=0, i=0;
  cin.getline(str,100);
while(str[end]!='\0')
{
  end++;
}
  for(i=end-1;i>=0;i--)
    rev[j++]=str[i];
cout<<rev;
}