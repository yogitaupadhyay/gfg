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

  //Date  15/02/2019
  import java.io.*;
  import java.util.*;
  
 public class WriteDemo2 {

	public static void main(String args[]){
	
	
	   String fileName="data2.txt";
	   
	   FileWriter fw  = null;
		  try{
              //fw  = new FileWriter(fileName);//over write
              fw  = new FileWriter(fileName,true);//append with old data
		     
			 Date d1  = new Date();
			 fw.write("today date & time  = "+ d1 +"\n");
		    System.out.println("writing done");
		  
	      }catch(IOException  e){
		      System.out.println("IO ERROR  " + e.getMessage());    
	      }catch(Exception  e){
		      System.out.println("Error " +e.getMessage());
		  }finally{
		      //close file
			    if(fw!=null){
				     try{
						fw.close();//NOTE :new file must be close to save 
						  System.out.println("file Saved");
					 }catch(IOException e){
					    System.out.println("File Not Saved why?" + e.getMessage());
					 }
				}
		  }
	  
	}//end main

}//end class