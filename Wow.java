import java.util.*;

public class Wow{
  public static void main(String args[]){
	  Scanner scan=new Scanner(System.in);
	 String str=scan.nextLine();
	 ArrayList<Integer>list=new ArrayList<Integer>();
	 int k=0;
	while(k<str.length()&&str.charAt(k)=='o'){
		k++;
	}
	 int count=0;
	 boolean wcount=true;
	 //System.out.println("k="+k);
	  for(int i=k;i<str.length();i++){
		  //System.out.println("char at i="+str.charAt(i));
		  if(str.charAt(i)=='v'&&wcount){
			  count++;
		  }else if(str.charAt(i)=='v'&&wcount==false){
			  list.add(count);
			 // System.out.println("o="+count);
			  wcount=true;
			  count=1;;
		  }else if(str.charAt(i)=='o'&&wcount){
			  list.add(count-1);
			 // System.out.println("w="+count);
			  wcount=false;
			  count=1;
		  }else  if(str.charAt(i)=='o'&&wcount==false){
			  count++;
		  }
		 
	  }
	  if(wcount){
		  list.add(count-1);
	  }else{
	  list.add(count);
	  }
	  
	  
	  int sum=0;
	  for(int i=0;i<list.size();i=i+2){
		  int jsum=0;
		  for(int j=i+1;j+1<list.size();j=j+2){
			  jsum=jsum+list.get(j);
			  sum=sum+list.get(i)*jsum*list.get(j+1);
			  
		  }
	  }
	  
	  System.out.println(sum);
	  
  }//end of main

}//end of class