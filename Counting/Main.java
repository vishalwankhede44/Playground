#include<iostream>
using namespace std;
int main()
{
  string s;
  int v=0,c=0,w=0,d=0,sy=0;
  getline(cin,s);
  
  for(int i=0;i<s.size();i++)
  {
      if(s[i]=='A'||s[i]=='a'||s[i]=='E'||s[i]=='e'||s[i]=='i'||s[i]=='I'||s[i]=='O'||s[i]=='o'||s[i]=='u'||s[i]=='U') 
        v++;
      else if(s[i]==' ')
        w++;
      else if(s[i]>='0' && s[i]<='9')
        d++;
      else if((s[i]>=33 && s[i]<=47)||(s[i]>=58 && s[i]<=64))
        sy++;
  }
  cout<<"Vowels:"<<v;
  cout<<"\nConsonants:"<<(s.size()-w-d-sy-v);
  cout<<"\nWhite Spaces:"<<w;
  cout<<"\nDigits:"<<d;
  cout<<"\nSymbols:"<<sy;
}