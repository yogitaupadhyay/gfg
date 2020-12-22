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
 public class SisCopyCon {

	public static void main(String args[]){
	if(args.length<1){
	  System.out.println("plz pass file name  to create it with empty size");
	  System.exit(0);
	}
	
 
	  File  file = new File( args[0]);
	  
	  if(!file.exists()){
			try{
			boolean isCreated = file.createNewFile();
			 System.out.println(isCreated?"file is created ":" file is NOT Created" );
			 System.out.println(file.getName());
			 System.out.println(file.getAbsolutePath());
			}catch(java.io.IOException e){
			  System.out.println("File NOT CREATED  Reson "+ e.getMessage());
			} 
	  }else{
	    System.out.println("its already exists Found");
	  
	  }
	  
	  
	}//end main

}//end class