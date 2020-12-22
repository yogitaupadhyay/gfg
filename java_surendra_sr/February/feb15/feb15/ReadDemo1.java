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
 public class ReadDemo1 {

	public static void main(String args[]){
	
	   String fileName="info.txt";//args[0]
	  
	  FileReader fr = null;
	      
		  try{
				fr  = new FileReader(fileName);//file open
				System.out.println("file opened");
				 int data = fr.read();
				 System.out.println((char)data);
				 data = fr.read();
				 System.out.println((char)data);
				 
				 data = fr.read();
				 System.out.println((char)data);
		  //tod reading
	      }catch(FileNotFoundException  e){
				System.out.println("Given file "+fileName  +"  not found");
	      }catch(IOException  e){
		      System.out.println("IO ERROR  " + e.getMessage());    
	      }catch(Exception  e){
		      System.out.println("Error " +e.getMessage());
		  }finally{
		      //close file
			    if(fr!=null){
				     try{
						fr.close();
						System.out.println("File Successfuly closed");
					 }catch(IOException e){
					    System.out.println("file properly not closed");
					 }
				}
		  }
	  
	}//end main

}//end class