package nit.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SapceShipCopy {	    
	    public static void main(String[] args) {    
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[][]=new int[n][5];
	        for(int i=0;i<n;i++)
	        {	        
	        for(int j=0;j<5;j++)
	        {
	        arr[i][j]=sc.nextInt();
	        }	            
	        }	    
	       System.out.println(repeat(n,arr,1,2,n,0));
	    }	    
	    public static int repeat(int pos,int [][]arr,int bomb,int place,int n,int coins)
	    { //System.out.println(pos+" "+place+" "+bomb+" "+coins);
	      if(pos<0||place>=5||place<0)
	           return coins;
	      
	      if(pos!=n){
	      if(arr[pos][place]==2)
	       {
	       return coins;
	       }
	        if(arr[pos][place]==1)
	            coins++;
	      }
	      
	        int brr[][]=new int[n][n];
	    if(bomb==1)
	    { 
	        for(int i=0;i<n;i++)
	        {
	        for(int j=0;j<5;j++)
	        {
	        brr[i][j]=arr[i][j];
	        }    
	        }
	        int count=5;
	        int index=pos;
	        while(index-->0&&count-->0)
	        {
	        for(int j=0;j<5;j++)
	        {
	        if(brr[index][j]==2)
	        {
	        brr[index][j]=0;
	        }
	        }
	        }
	    
	    }	 
	        if(bomb==1)
	        {
	            int position=pos-1;
	            int nm=place;
	            int lm=place-1;
	            int rm=place+1;
	            int x=repeat(position,arr,1,lm, n,coins);
	            int y=repeat(position,arr,1,nm, n,coins);
	            int z=repeat(position,arr,1,rm,n,coins);
	            int a=repeat(position,brr,0,lm,n,coins);
	            int b=repeat(position,brr,0,nm,n,coins); 
	            int c=repeat(position,brr,0,rm,n,coins);
	            int d=Math.max(Math.max(Math.max(x, y), Math.max(z, a)),Math.max(b, c));
	            return d;	        
	        }
	    else
	        {int position=pos-1;
	            int nm=place;
	            int lm=place-1;
	            int rm=place+1;
	            int z=Math.max(repeat(position,arr,0,lm,n,coins), repeat(position,arr,0,nm,n,coins));
	        return Math.max(z, repeat(position,arr,0,rm,n,coins));
	        
	        }	      
	    }	 
}
