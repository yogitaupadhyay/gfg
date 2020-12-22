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
  
 public class DiceGame {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	java.util.Random rand  = new java.util.Random();
	
	System.out.println("enter your id number(int)");
	int id = scan.nextInt();
	
	   String fileName="dice_data_"+ id  +".txt";
	   
	   FileWriter fw  = null;
		  try{
              fw  = new FileWriter(fileName);//over write
              //fw  = new FileWriter(fileName,true);//append with old data
		     
			 Date d1  = new Date();
			 int sum  =0;
			 fw.write("When Created  = "+ d1 +"\n");
			 for(int dice=1;dice<=5;dice++){
			   int diceNumber  = (rand.nextInt(6)+1);
			     fw.write(dice +"::"+diceNumber +"\n");
				 sum = sum  + diceNumber;
			 }
			     fw.write("total sum = " +sum +"\n");
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