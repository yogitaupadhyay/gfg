#include<iostream>
#include<map>
#include<iterator> 
using namespace std;
 int main()
{
map<char,int>mp;
//insert
   pair<map<char ,int>::iterator,bool>ptr;
   mp.insert(pair<char ,int>('a',20));
  ptr=mp.insert(pair<char ,int>('b',40));
  if(ptr.second){
  	cout<<"element was newly inserted"<<"\n";
  }else{
  	cout<<"element was already present"<<"\n";
  }
  
  //printing
  map<char ,int>::iterator it1;
  for(it1=mp.begin();it1!=mp.end();++it1){
  	cout<<it1->first<<" "<<it1->second<<"\n";
  }
  //insert using hint
  map<char ,int>::iterator it;
  it=mp.begin();
  mp.insert(it,pair<char ,int>('c',60));
  for(it1=mp.begin();it1!=mp.end();++it1){
  	cout<<it1->first<<" "<<it1->second<<"\n";
  }
  //copying map
  map<char,int>mp1;
  mp1.insert(mp.begin(),mp.end());
  for(it1=mp1.begin();it1!=mp1.end();++it1){
  	cout<<it1->first<<" "<<it1->second<<"\n";
  }
  ///emplace
  /*map<char ,int>::iterator it2;
 ptr= mp.emplace(it2,'d',24);
 if(ptr.second){
  	cout<<"element was newly inserted"<<"\n";
  }else{
  	cout<<"element was already present"<<"\n";
  }*/
  //using []
  mp['d']=80;
  mp['e']=100;
  cout<<"d "<<mp['d'];
  cout<<" e "<<mp['e'];
  return 0;
}
