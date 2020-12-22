/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  13/01/2019
  
  import java.io.*;
 public class Req1 {

	public static void main(String args[]){
	if(args.length<1){
	  System.out.println("plz pass file folder with or withou path");
	  System.exit(0);
	}
	
	 String fileNameWithPath = args[0];
	  File  file  = null;
	  file  = new File(fileNameWithPath);
	  if(file.exists()){
	    System.out.println("Found");
		  if(file.isDirectory()){
		     System.out.println(" its Folder type");
		  }else{
		     System.out.println(" its File type");
		  }
		
		
	  }else{
	    System.out.println("NOT Found");
	  
	  }
	  
	  
	}//end main

}//end class