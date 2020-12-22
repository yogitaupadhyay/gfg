#include<iostream>
using namespace std;
int main()
{
	int page[20],frame[10];int np,nf,i,j;int tk=0,p=0;int x=0;
	cout<<"enter the no of pages";cin>>np;
	cout<<"enter the no of frames";cin>>nf;
	cout<<"enter the page identification";
	for(i=0;i<np;i++)
	{
	 cin>>page[i];	
	}
	//output page
	for(i=0;i<np;i++)
    {
    	cout<<page[i]<<"\n";	
	}
	//frame to 0
	for(i=0;i<nf;i++)
	{
	frame[i]=-1;
	}
		//algo
		if(tk<np)
		{
	    	if(tk<=nf)
	       	{
	      	    for(i=0;i<nf;i++)
			     {
     	          frame[i]=page[i];tk++;p++;
     	          cout<<p<<"= ";
     	          for(j=0;j<nf;j++)
                     {
    	               cout<<frame[j];	
                   	}
                   	cout<<"\n";
		          }	
	      	}
	
	      	while(tk>=nf&&tk<np){
	      		//compaison
		for(i=0;i<nf;i++)
			     {
			     		
				if(page[tk]==frame[i])
				{x++;}
				 
				 	 if(x==0){
					  
			     	if(tk<np){
					
     	          frame[i]=page[tk];p++;
				  tk++;
				  cout<<p<<"= ";
     	          for(j=0;j<nf;j++)
                     {
    	               cout<<frame[j];
                   	}
                   	cout<<"\n";
                   	 
                   }
		          }	
				  if(x!=0){
				  	tk++;
				  	if(tk<np){
					
     	          frame[i]=page[tk];p++;
				  tk++;
				  cout<<p<<"= ";
     	          for(j=0;j<nf;j++)
                     {
    	               cout<<frame[j];
                   	}
                   	cout<<"\n";
                   	 
                   }
				  }      	
			 }
				
			  }
	   }
	
}
