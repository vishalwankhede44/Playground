#include<iostream>
#include<cmath>
#include <iomanip>
using namespace std;
int main()
{
 int nballs,nruns,nruns_scored,nballs_bowled;
 cin>>nballs>>nruns>>nruns_scored>>nballs_bowled;
 int overs;
  
 cout<<nballs/6<<"\n";
  int current_over =  (nballs_bowled/6);
  
 cout<<((current_over)+((nballs_bowled%6)/10.0))<<"\n";
  
 float current_runrate =nruns_scored/((current_over)+((nballs_bowled%6)/10.0)) ; 
 printf("%.1f \n",current_runrate);
 int rem;
 double rem_over;
  printf("%.1f \n",(nruns/(nballs/6.0)));
  if(current_runrate >=  (nruns/(nballs/6.0)))
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
}