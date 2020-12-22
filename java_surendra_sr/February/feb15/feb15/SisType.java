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
//	  java.io.FileNotFoundException
 public class SisType {

	public static void main(String args[]){
	if(args.length<1){
	  System.out.println("plz pass text file to read");
	  System.exit(0);
	}
	
	   String fileName=args[0];
	  FileReader fr = null;
	      
		  try{
				fr  = new FileReader(fileName);//file open
				 int data;
				while((data=fr.read())!=-1)	{
				   System.out.print((char)data);
				}
	      }catch(FileNotFoundException  e){
				System.out.println("File Not Exist");
	      }catch(IOException  e){
		      System.out.println("IO ERROR  " + e.getMessage());    
	      }catch(Exception  e){
		      System.out.println("Error " +e.getMessage());
		  }finally{
		      //close file
			    if(fr!=null){
				     try{
						fr.close();
					 }catch(IOException e){
					    System.out.println("file properly not closed");
					 }
				}
		  }
	  
	}//end main

}//end class